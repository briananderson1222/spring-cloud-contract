package org.springframework.cloud.contract.verifier.builder;

class ClassToBuildDemo {
}

class JUnit4Imports implements Imports {

	private final BlockBuilder blockBuilder;

	JUnit4Imports(BlockBuilder blockBuilder) {
		this.blockBuilder = blockBuilder;
	}

	@Override
	public Imports call() {
		// org.junit.Assert
		// org.junit.Assume
		// org.junit.Assume1
		// org.junit.Assume2
		// org.junit.Assume3
		// org.junit.foo.bar.Assume4
		return null;
	}

	@Override
	public boolean accept() {
		return false;
	}
}

class JsonImports implements Imports {

	private final BlockBuilder blockBuilder;

	JsonImports(BlockBuilder blockBuilder) {
		this.blockBuilder = blockBuilder;
	}

	@Override
	public Imports call() {
		return null;
	}

	@Override
	public boolean accept() {
		return false;
	}
}

class MockMvcImports implements Imports {

	private final BlockBuilder blockBuilder;

	MockMvcImports(BlockBuilder blockBuilder) {
		this.blockBuilder = blockBuilder;
	}

	@Override
	public Imports call() {
		return null;
	}

	@Override
	public boolean accept() {
		return false;
	}
}

class JavaClassMetaData implements ClassMetaData {

	private final BlockBuilder blockBuilder;
	private final ContractMetaData contractMetaData;

	JavaClassMetaData(BlockBuilder blockBuilder, ContractMetaData contractMetaData) {
		this.blockBuilder = blockBuilder;
		this.contractMetaData = contractMetaData;
	}

	@Override
	public ClassMetaData packageDefinition() {
		this.blockBuilder.addLine(this.contractMetaData.generatedClassData.classPackage);
		return this;
	}

	/*
	package ....

	imports ....

	@annotations
	modifier class name extends parent {

		(indent) modifier methodname() {

		}

		(indent) modifier methodname() {

		}

	}


	packageDefinition()
	// block builder new line
	.imports()
	// block builder new line
	.classAnnotations()
	.modifier().className().parentClass()
	.call( cos -> {
		cos.methods.
		filter(Acceptor::accept).
		.forEach(Visitor::call)

		cos.methods.
		filter(Acceptor::accept).
		.forEach(Visitor::call)
	})

	 */

	@Override
	public ClassMetaData modifier() {
		return this;
	}

	@Override
	public ClassMetaData fileExtension() {
		return this;
	}

	@Override
	public ClassMetaData suffix() {
		return this;
	}

	@Override
	public ClassMetaData setupLineEnding() {
		return this;
	}

	@Override
	public ClassMetaData parentClass() {
		return this;
	}

	@Override
	public ClassMetaData className() {
		return this;
	}

	@Override
	public ClassMetaData call() {
		return null;
	}

	@Override
	public boolean accept() {
		return false;
	}
}

class JUnit4ClassAnnotation implements ClassAnnotation {

	private final BlockBuilder blockBuilder;

	JUnit4ClassAnnotation(BlockBuilder blockBuilder) {
		this.blockBuilder = blockBuilder;
	}

	@Override
	public boolean accept() {
		return false;
	}

	@Override
	public ClassAnnotation call() {
		return null;
	}
}