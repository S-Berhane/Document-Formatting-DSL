// Generated from Resume.g4 by ANTLR 4.5
package com.resumecompiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ResumeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ResumeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ResumeParser#startrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartrule(ResumeParser.StartruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(ResumeParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ResumeParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ResumeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#texttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexttype(ResumeParser.TexttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ResumeParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#personal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonal(ResumeParser.PersonalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#experience}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperience(ResumeParser.ExperienceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#education}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEducation(ResumeParser.EducationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkills(ResumeParser.SkillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#pertype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPertype(ResumeParser.PertypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#edutype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdutype(ResumeParser.EdutypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#exptype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptype(ResumeParser.ExptypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#skitype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkitype(ResumeParser.SkitypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResumeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ResumeParser.ValueContext ctx);
}