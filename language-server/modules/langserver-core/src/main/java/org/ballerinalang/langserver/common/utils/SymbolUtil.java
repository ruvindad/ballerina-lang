/*
 * Copyright (c) 2020, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ballerinalang.langserver.common.utils;

import io.ballerina.compiler.api.symbols.AnnotationSymbol;
import io.ballerina.compiler.api.symbols.ConstantSymbol;
import io.ballerina.compiler.api.symbols.FunctionSymbol;
import io.ballerina.compiler.api.symbols.Symbol;
import io.ballerina.compiler.api.symbols.SymbolKind;
import io.ballerina.compiler.api.symbols.TypeSymbol;
import io.ballerina.compiler.api.symbols.VariableSymbol;
import io.ballerina.compiler.api.types.BallerinaTypeDescriptor;
import io.ballerina.compiler.api.types.ObjectTypeDescriptor;
import io.ballerina.compiler.api.types.RecordTypeDescriptor;
import io.ballerina.compiler.api.types.TypeDescKind;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Carries a set of utilities to check the types of the symbols.
 *
 * @since 2.0.0
 */
public class SymbolUtil {
    private SymbolUtil() {
    }

    /**
     * Check whether the given symbol is a symbol with the type Object.
     *
     * @param symbol to evaluate
     * @return {@link Boolean} whether the symbol holds the type object
     */
    public static boolean isObject(Symbol symbol) {
        if (symbol.kind() != SymbolKind.VARIABLE) {
            return false;
        }
        Optional<BallerinaTypeDescriptor> typeDescriptor = ((VariableSymbol) symbol).typeDescriptor();

        return typeDescriptor.isPresent() && typeDescriptor.get().kind() == TypeDescKind.OBJECT;
    }

    /**
     * Check whether the given symbol is a symbol with the type Record.
     *
     * @param symbol to evaluate
     * @return {@link Boolean} whether the symbol holds the type record
     */
    public static boolean isRecord(Symbol symbol) {
        if (symbol.kind() != SymbolKind.VARIABLE) {
            return false;
        }
        Optional<BallerinaTypeDescriptor> typeDescriptor = ((VariableSymbol) symbol).typeDescriptor();

        return typeDescriptor.isPresent() && typeDescriptor.get().kind() == TypeDescKind.RECORD;
    }

    /**
     * Get the type descriptor of the given symbol.
     * If the symbol is not a variable symbol this method will return empty optional value
     *
     * @param symbol to evaluate
     * @return {@link Optional} type descriptor
     */
    public static Optional<? extends BallerinaTypeDescriptor> getTypeDescriptor(Symbol symbol) {
        if (symbol == null) {
            return Optional.empty();
        }
        switch (symbol.kind()) {
            case TYPE:
                return ((TypeSymbol) symbol).typeDescriptor();
            case VARIABLE:
                return ((VariableSymbol) symbol).typeDescriptor();
            case ANNOTATION:
                return ((AnnotationSymbol) symbol).typeDescriptor();
            case FUNCTION:
                return ((FunctionSymbol) symbol).typeDescriptor();
            case CONST:
                return ((ConstantSymbol) symbol).typeDescriptor();
            default:
                return Optional.empty();
        }
    }

    /**
     * Get the type descriptor for the object symbol.
     *
     * @param symbol to evaluate
     * @return {@link ObjectTypeDescriptor} for the object symbol
     */
    public static ObjectTypeDescriptor getTypeDescForObjectSymbol(Symbol symbol) {
        Optional<? extends BallerinaTypeDescriptor> typeDescriptor = getTypeDescriptor(symbol);
        if (typeDescriptor.isEmpty() || isObject(symbol)) {
            throw new UnsupportedOperationException("Cannot find a valid type descriptor");
        }

        return (ObjectTypeDescriptor) typeDescriptor.get();
    }

    /**
     * Get the type descriptor for the record symbol.
     *
     * @param symbol to evaluate
     * @return {@link RecordTypeDescriptor} for the record symbol
     */
    public static RecordTypeDescriptor getTypeDescForRecordSymbol(Symbol symbol) {
        Optional<? extends BallerinaTypeDescriptor> typeDescriptor = getTypeDescriptor(symbol);
        if (typeDescriptor.isEmpty() || isRecord(symbol)) {
            throw new UnsupportedOperationException("Cannot find a valid type descriptor");
        }

        return (RecordTypeDescriptor) typeDescriptor.get();
    }

    /**
     * Check Whether the provided symbol is a listener symbol.
     *
     * @param symbol to be evaluated
     * @return {@link Boolean} status of the evaluation
     */
    public static boolean isListener(TypeSymbol symbol) {
        if (symbol.typeDescriptor().isEmpty() || symbol.typeDescriptor().get().kind() != TypeDescKind.OBJECT) {
            return false;
        }
        List<String> attachedMethods = ((ObjectTypeDescriptor) symbol.typeDescriptor().get()).methods().stream()
                .map(Symbol::name)
                .collect(Collectors.toList());
        return attachedMethods.contains("__start") && attachedMethods.contains("__immediateStop")
                && attachedMethods.contains("__immediateStop") && attachedMethods.contains("__attach");
    }

    /**
     * Check whether the symbol is a listener object.
     *
     * @param symbol Symbol to evaluate
     * @return {@link Boolean}  whether listener or not
     */
    public static boolean isListener(VariableSymbol symbol) {
        Optional<BallerinaTypeDescriptor> typeDesc = symbol.typeDescriptor();
        if (typeDesc.isEmpty() || typeDesc.get().kind() != TypeDescKind.OBJECT) {
            return false;
        }

        return ((ObjectTypeDescriptor) typeDesc.get()).typeQualifiers()
                .contains(ObjectTypeDescriptor.TypeQualifier.LISTENER);
    }

    /**
     * Whether the symbol is an error symbol.
     *
     * @param symbol symbol to be evaluated
     * @return {@link Boolean} status of the evaluation
     */
    public static boolean isError(Symbol symbol) {
        if (symbol.kind() != SymbolKind.VARIABLE) {
            return false;
        }
        Optional<BallerinaTypeDescriptor> typeDescriptor = ((VariableSymbol) symbol).typeDescriptor();

        return typeDescriptor.isPresent() && typeDescriptor.get().kind() == TypeDescKind.ERROR;
    }

    /**
     * Check whether the given symbol is a symbol with the type Record.
     *
     * @param symbol to evaluate
     * @return {@link Boolean} whether the symbol holds the type record
     */
    public static Optional<TypeDescKind> getTypeKind(Symbol symbol) {
        if (symbol.kind() != SymbolKind.VARIABLE) {
            return Optional.empty();
        }
        Optional<BallerinaTypeDescriptor> typeDescriptor = ((VariableSymbol) symbol).typeDescriptor();

        return typeDescriptor.map(BallerinaTypeDescriptor::kind);
    }
}
