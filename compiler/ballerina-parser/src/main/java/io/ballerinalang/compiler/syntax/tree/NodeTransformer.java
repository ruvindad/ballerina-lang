/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerinalang.compiler.syntax.tree;


/**
 * The {@code NodeTransformer} transform each node in the syntax tree to
 * another object of type T.
 * <p>
 * This class separates tree nodes from various unrelated operations that needs
 * to be performed on the syntax tree nodes.
 * <p>
 * This class allows you to transform the syntax tree into something else without
 * mutating instance variables.
 * <p>
 * There exists a transform method for each node in the Ballerina syntax tree.
 * These methods return T. If you are looking for a visitor that has visit
 * methods that return void, see {@link NodeVisitor}.
 *
 * This is a generated class.
 *
 * @param <T> the type of class that is returned by visit methods
 * @see NodeVisitor
 * @since 1.3.0
 */
public abstract class NodeTransformer<T> {

    public T transform(ModulePartNode modulePartNode) {
        return transformSyntaxNode(modulePartNode);
    }

    public T transform(FunctionDefinitionNode functionDefinitionNode) {
        return transformSyntaxNode(functionDefinitionNode);
    }

    public T transform(ImportDeclarationNode importDeclarationNode) {
        return transformSyntaxNode(importDeclarationNode);
    }

    public T transform(ListenerDeclarationNode listenerDeclarationNode) {
        return transformSyntaxNode(listenerDeclarationNode);
    }

    public T transform(TypeDefinitionNode typeDefinitionNode) {
        return transformSyntaxNode(typeDefinitionNode);
    }

    public T transform(ServiceDeclarationNode serviceDeclarationNode) {
        return transformSyntaxNode(serviceDeclarationNode);
    }

    public T transform(AssignmentStatementNode assignmentStatementNode) {
        return transformSyntaxNode(assignmentStatementNode);
    }

    public T transform(CompoundAssignmentStatementNode compoundAssignmentStatementNode) {
        return transformSyntaxNode(compoundAssignmentStatementNode);
    }

    public T transform(VariableDeclarationNode variableDeclarationNode) {
        return transformSyntaxNode(variableDeclarationNode);
    }

    public T transform(BlockStatementNode blockStatementNode) {
        return transformSyntaxNode(blockStatementNode);
    }

    public T transform(BreakStatementNode breakStatementNode) {
        return transformSyntaxNode(breakStatementNode);
    }

    public T transform(ExpressionStatementNode expressionStatementNode) {
        return transformSyntaxNode(expressionStatementNode);
    }

    public T transform(ContinueStatementNode continueStatementNode) {
        return transformSyntaxNode(continueStatementNode);
    }

    public T transform(ExternalFunctionBodyNode externalFunctionBodyNode) {
        return transformSyntaxNode(externalFunctionBodyNode);
    }

    public T transform(IfElseStatementNode ifElseStatementNode) {
        return transformSyntaxNode(ifElseStatementNode);
    }

    public T transform(ElseBlockNode elseBlockNode) {
        return transformSyntaxNode(elseBlockNode);
    }

    public T transform(WhileStatementNode whileStatementNode) {
        return transformSyntaxNode(whileStatementNode);
    }

    public T transform(PanicStatementNode panicStatementNode) {
        return transformSyntaxNode(panicStatementNode);
    }

    public T transform(ReturnStatementNode returnStatementNode) {
        return transformSyntaxNode(returnStatementNode);
    }

    public T transform(LocalTypeDefinitionStatementNode localTypeDefinitionStatementNode) {
        return transformSyntaxNode(localTypeDefinitionStatementNode);
    }

    public T transform(LockStatementNode lockStatementNode) {
        return transformSyntaxNode(lockStatementNode);
    }

    public T transform(ForkStatementNode forkStatementNode) {
        return transformSyntaxNode(forkStatementNode);
    }

    public T transform(ForEachStatementNode forEachStatementNode) {
        return transformSyntaxNode(forEachStatementNode);
    }

    public T transform(BinaryExpressionNode binaryExpressionNode) {
        return transformSyntaxNode(binaryExpressionNode);
    }

    public T transform(BracedExpressionNode bracedExpressionNode) {
        return transformSyntaxNode(bracedExpressionNode);
    }

    public T transform(CheckExpressionNode checkExpressionNode) {
        return transformSyntaxNode(checkExpressionNode);
    }

    public T transform(FieldAccessExpressionNode fieldAccessExpressionNode) {
        return transformSyntaxNode(fieldAccessExpressionNode);
    }

    public T transform(FunctionCallExpressionNode functionCallExpressionNode) {
        return transformSyntaxNode(functionCallExpressionNode);
    }

    public T transform(MethodCallExpressionNode methodCallExpressionNode) {
        return transformSyntaxNode(methodCallExpressionNode);
    }

    public T transform(MappingConstructorExpressionNode mappingConstructorExpressionNode) {
        return transformSyntaxNode(mappingConstructorExpressionNode);
    }

    public T transform(IndexedExpressionNode indexedExpressionNode) {
        return transformSyntaxNode(indexedExpressionNode);
    }

    public T transform(TypeofExpressionNode typeofExpressionNode) {
        return transformSyntaxNode(typeofExpressionNode);
    }

    public T transform(UnaryExpressionNode unaryExpressionNode) {
        return transformSyntaxNode(unaryExpressionNode);
    }

    public T transform(ComputedNameFieldNode computedNameFieldNode) {
        return transformSyntaxNode(computedNameFieldNode);
    }

    public T transform(ConstantDeclarationNode constantDeclarationNode) {
        return transformSyntaxNode(constantDeclarationNode);
    }

    public T transform(DefaultableParameterNode defaultableParameterNode) {
        return transformSyntaxNode(defaultableParameterNode);
    }

    public T transform(RequiredParameterNode requiredParameterNode) {
        return transformSyntaxNode(requiredParameterNode);
    }

    public T transform(RestParameterNode restParameterNode) {
        return transformSyntaxNode(restParameterNode);
    }

    public T transform(ExpressionListItemNode expressionListItemNode) {
        return transformSyntaxNode(expressionListItemNode);
    }

    public T transform(ImportOrgNameNode importOrgNameNode) {
        return transformSyntaxNode(importOrgNameNode);
    }

    public T transform(ImportPrefixNode importPrefixNode) {
        return transformSyntaxNode(importPrefixNode);
    }

    public T transform(ImportSubVersionNode importSubVersionNode) {
        return transformSyntaxNode(importSubVersionNode);
    }

    public T transform(ImportVersionNode importVersionNode) {
        return transformSyntaxNode(importVersionNode);
    }

    public T transform(SpecificFieldNode specificFieldNode) {
        return transformSyntaxNode(specificFieldNode);
    }

    public T transform(SpreadFieldNode spreadFieldNode) {
        return transformSyntaxNode(spreadFieldNode);
    }

    public T transform(NamedArgumentNode namedArgumentNode) {
        return transformSyntaxNode(namedArgumentNode);
    }

    public T transform(PositionalArgumentNode positionalArgumentNode) {
        return transformSyntaxNode(positionalArgumentNode);
    }

    public T transform(RestArgumentNode restArgumentNode) {
        return transformSyntaxNode(restArgumentNode);
    }

    public T transform(ObjectTypeDescriptorNode objectTypeDescriptorNode) {
        return transformSyntaxNode(objectTypeDescriptorNode);
    }

    public T transform(RecordTypeDescriptorNode recordTypeDescriptorNode) {
        return transformSyntaxNode(recordTypeDescriptorNode);
    }

    public T transform(ReturnTypeDescriptorNode returnTypeDescriptorNode) {
        return transformSyntaxNode(returnTypeDescriptorNode);
    }

    public T transform(NilTypeDescriptorNode nilTypeDescriptorNode) {
        return transformSyntaxNode(nilTypeDescriptorNode);
    }

    public T transform(OptionalTypeDescriptorNode optionalTypeDescriptorNode) {
        return transformSyntaxNode(optionalTypeDescriptorNode);
    }

    public T transform(ObjectFieldNode objectFieldNode) {
        return transformSyntaxNode(objectFieldNode);
    }

    public T transform(RecordFieldNode recordFieldNode) {
        return transformSyntaxNode(recordFieldNode);
    }

    public T transform(RecordFieldWithDefaultValueNode recordFieldWithDefaultValueNode) {
        return transformSyntaxNode(recordFieldWithDefaultValueNode);
    }

    public T transform(RecordRestDescriptorNode recordRestDescriptorNode) {
        return transformSyntaxNode(recordRestDescriptorNode);
    }

    public T transform(TypeReferenceNode typeReferenceNode) {
        return transformSyntaxNode(typeReferenceNode);
    }

    public T transform(ServiceBodyNode serviceBodyNode) {
        return transformSyntaxNode(serviceBodyNode);
    }

    public T transform(AnnotationNode annotationNode) {
        return transformSyntaxNode(annotationNode);
    }

    public T transform(MetadataNode metadataNode) {
        return transformSyntaxNode(metadataNode);
    }

    public T transform(ModuleVariableDeclarationNode moduleVariableDeclarationNode) {
        return transformSyntaxNode(moduleVariableDeclarationNode);
    }

    public T transform(TypeTestExpressionNode typeTestExpressionNode) {
        return transformSyntaxNode(typeTestExpressionNode);
    }

    public T transform(RemoteMethodCallActionNode remoteMethodCallActionNode) {
        return transformSyntaxNode(remoteMethodCallActionNode);
    }

    public T transform(ParameterizedTypeDescriptorNode parameterizedTypeDescriptorNode) {
        return transformSyntaxNode(parameterizedTypeDescriptorNode);
    }

    public T transform(NilLiteralNode nilLiteralNode) {
        return transformSyntaxNode(nilLiteralNode);
    }

    public T transform(AnnotationDeclarationNode annotationDeclarationNode) {
        return transformSyntaxNode(annotationDeclarationNode);
    }

    public T transform(AnnotationAttachPointNode annotationAttachPointNode) {
        return transformSyntaxNode(annotationAttachPointNode);
    }

    public T transform(XMLNamespaceDeclarationNode xMLNamespaceDeclarationNode) {
        return transformSyntaxNode(xMLNamespaceDeclarationNode);
    }

    public T transform(FunctionBodyBlockNode functionBodyBlockNode) {
        return transformSyntaxNode(functionBodyBlockNode);
    }

    public T transform(NamedWorkerDeclarationNode namedWorkerDeclarationNode) {
        return transformSyntaxNode(namedWorkerDeclarationNode);
    }

    public T transform(NamedWorkerDeclarator namedWorkerDeclarator) {
        return transformSyntaxNode(namedWorkerDeclarator);
    }

    public T transform(DocumentationStringNode documentationStringNode) {
        return transformSyntaxNode(documentationStringNode);
    }

    public T transform(BasicLiteralNode basicLiteralNode) {
        return transformSyntaxNode(basicLiteralNode);
    }

    public T transform(SimpleNameReferenceNode simpleNameReferenceNode) {
        return transformSyntaxNode(simpleNameReferenceNode);
    }

    public T transform(QualifiedNameReferenceNode qualifiedNameReferenceNode) {
        return transformSyntaxNode(qualifiedNameReferenceNode);
    }

    public T transform(BuiltinSimpleNameReferenceNode builtinSimpleNameReferenceNode) {
        return transformSyntaxNode(builtinSimpleNameReferenceNode);
    }

    public T transform(TrapExpressionNode trapExpressionNode) {
        return transformSyntaxNode(trapExpressionNode);
    }

    public T transform(ListConstructorExpressionNode listConstructorExpressionNode) {
        return transformSyntaxNode(listConstructorExpressionNode);
    }

    public T transform(TypeCastExpressionNode typeCastExpressionNode) {
        return transformSyntaxNode(typeCastExpressionNode);
    }

    public T transform(TypeCastParamNode typeCastParamNode) {
        return transformSyntaxNode(typeCastParamNode);
    }

    public T transform(UnionTypeDescriptorNode unionTypeDescriptorNode) {
        return transformSyntaxNode(unionTypeDescriptorNode);
    }

    public T transform(TableConstructorExpressionNode tableConstructorExpressionNode) {
        return transformSyntaxNode(tableConstructorExpressionNode);
    }

    public T transform(KeySpecifierNode keySpecifierNode) {
        return transformSyntaxNode(keySpecifierNode);
    }

    public T transform(ErrorTypeDescriptorNode errorTypeDescriptorNode) {
        return transformSyntaxNode(errorTypeDescriptorNode);
    }

    public T transform(ErrorTypeParamsNode errorTypeParamsNode) {
        return transformSyntaxNode(errorTypeParamsNode);
    }

    public T transform(StreamTypeDescriptorNode streamTypeDescriptorNode) {
        return transformSyntaxNode(streamTypeDescriptorNode);
    }

    public T transform(StreamTypeParamsNode streamTypeParamsNode) {
        return transformSyntaxNode(streamTypeParamsNode);
    }

    public T transform(LetExpressionNode letExpressionNode) {
        return transformSyntaxNode(letExpressionNode);
    }

    public T transform(LetVariableDeclarationNode letVariableDeclarationNode) {
        return transformSyntaxNode(letVariableDeclarationNode);
    }

    public T transform(TemplateExpressionNode templateExpressionNode) {
        return transformSyntaxNode(templateExpressionNode);
    }

    public T transform(XMLElementNode xMLElementNode) {
        return transformSyntaxNode(xMLElementNode);
    }

    public T transform(XMLStartTagNode xMLStartTagNode) {
        return transformSyntaxNode(xMLStartTagNode);
    }

    public T transform(XMLEndTagNode xMLEndTagNode) {
        return transformSyntaxNode(xMLEndTagNode);
    }

    public T transform(XMLSimpleNameNode xMLSimpleNameNode) {
        return transformSyntaxNode(xMLSimpleNameNode);
    }

    public T transform(XMLQualifiedNameNode xMLQualifiedNameNode) {
        return transformSyntaxNode(xMLQualifiedNameNode);
    }

    public T transform(XMLEmptyElementNode xMLEmptyElementNode) {
        return transformSyntaxNode(xMLEmptyElementNode);
    }

    public T transform(InterpolationNode interpolationNode) {
        return transformSyntaxNode(interpolationNode);
    }

    public T transform(XMLTextNode xMLTextNode) {
        return transformSyntaxNode(xMLTextNode);
    }

    public T transform(XMLAttributeNode xMLAttributeNode) {
        return transformSyntaxNode(xMLAttributeNode);
    }

    public T transform(XMLAttributeValue xMLAttributeValue) {
        return transformSyntaxNode(xMLAttributeValue);
    }

    public T transform(XMLComment xMLComment) {
        return transformSyntaxNode(xMLComment);
    }

    public T transform(XMLProcessingInstruction xMLProcessingInstruction) {
        return transformSyntaxNode(xMLProcessingInstruction);
    }

    public T transform(TableTypeDescriptorNode tableTypeDescriptorNode) {
        return transformSyntaxNode(tableTypeDescriptorNode);
    }

    public T transform(TypeParameterNode typeParameterNode) {
        return transformSyntaxNode(typeParameterNode);
    }

    public T transform(KeyTypeConstraintNode keyTypeConstraintNode) {
        return transformSyntaxNode(keyTypeConstraintNode);
    }

    public T transform(FunctionTypeDescriptorNode functionTypeDescriptorNode) {
        return transformSyntaxNode(functionTypeDescriptorNode);
    }

    public T transform(FunctionSignatureNode functionSignatureNode) {
        return transformSyntaxNode(functionSignatureNode);
    }

    public T transform(ExplicitAnonymousFunctionExpressionNode explicitAnonymousFunctionExpressionNode) {
        return transformSyntaxNode(explicitAnonymousFunctionExpressionNode);
    }

    public T transform(ExpressionFunctionBodyNode expressionFunctionBodyNode) {
        return transformSyntaxNode(expressionFunctionBodyNode);
    }

    public T transform(TupleTypeDescriptorNode tupleTypeDescriptorNode) {
        return transformSyntaxNode(tupleTypeDescriptorNode);
    }

    public T transform(ParenthesisedTypeDescriptorNode parenthesisedTypeDescriptorNode) {
        return transformSyntaxNode(parenthesisedTypeDescriptorNode);
    }

    public T transform(ExplicitNewExpressionNode explicitNewExpressionNode) {
        return transformSyntaxNode(explicitNewExpressionNode);
    }

    public T transform(ImplicitNewExpressionNode implicitNewExpressionNode) {
        return transformSyntaxNode(implicitNewExpressionNode);
    }

    public T transform(ParenthesizedArgList parenthesizedArgList) {
        return transformSyntaxNode(parenthesizedArgList);
    }

    public T transform(QueryConstructTypeNode queryConstructTypeNode) {
        return transformSyntaxNode(queryConstructTypeNode);
    }

    public T transform(FromClauseNode fromClauseNode) {
        return transformSyntaxNode(fromClauseNode);
    }

    public T transform(WhereClauseNode whereClauseNode) {
        return transformSyntaxNode(whereClauseNode);
    }

    public T transform(LetClauseNode letClauseNode) {
        return transformSyntaxNode(letClauseNode);
    }

    public T transform(QueryPipelineNode queryPipelineNode) {
        return transformSyntaxNode(queryPipelineNode);
    }

    public T transform(SelectClauseNode selectClauseNode) {
        return transformSyntaxNode(selectClauseNode);
    }

    public T transform(QueryExpressionNode queryExpressionNode) {
        return transformSyntaxNode(queryExpressionNode);
    }

    public T transform(IntersectionTypeDescriptorNode intersectionTypeDescriptorNode) {
        return transformSyntaxNode(intersectionTypeDescriptorNode);
    }

    public T transform(ImplicitAnonymousFunctionParameters implicitAnonymousFunctionParameters) {
        return transformSyntaxNode(implicitAnonymousFunctionParameters);
    }

    public T transform(ImplicitAnonymousFunctionExpressionNode implicitAnonymousFunctionExpressionNode) {
        return transformSyntaxNode(implicitAnonymousFunctionExpressionNode);
    }

    public T transform(StartActionNode startActionNode) {
        return transformSyntaxNode(startActionNode);
    }

    public T transform(FlushActionNode flushActionNode) {
        return transformSyntaxNode(flushActionNode);
    }

    public T transform(FunctionDeclarationNode functionDeclarationNode) {
        return transformSyntaxNode(functionDeclarationNode);
    }

    // Tokens

    public T transform(Token token) {
        return null;
    }

    public T transform(IdentifierToken identifier) {
        return null;
    }

    // Misc

    /**
     * Transforms the given {@code Node} into an object of type T.
     * <p>
     * This method is invoked by each transform method in this class. You can
     * override it to provide a common transformation for each node.
     *
     * @param node the {@code Node} to be transformed
     * @return the transformed object
     */
    protected abstract T transformSyntaxNode(Node node);
}
