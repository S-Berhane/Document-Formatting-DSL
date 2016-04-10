// Generated from Resume.g4 by ANTLR 4.5
package com.resumecompiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ResumeParser}.
 */
public interface ResumeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ResumeParser#startrule}.
	 * @param ctx the parse tree
	 */
	void enterStartrule(ResumeParser.StartruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#startrule}.
	 * @param ctx the parse tree
	 */
	void exitStartrule(ResumeParser.StartruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ResumeParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ResumeParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ResumeParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ResumeParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ResumeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ResumeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#texttype}.
	 * @param ctx the parse tree
	 */
	void enterTexttype(ResumeParser.TexttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#texttype}.
	 * @param ctx the parse tree
	 */
	void exitTexttype(ResumeParser.TexttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ResumeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ResumeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#personal}.
	 * @param ctx the parse tree
	 */
	void enterPersonal(ResumeParser.PersonalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#personal}.
	 * @param ctx the parse tree
	 */
	void exitPersonal(ResumeParser.PersonalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#experience}.
	 * @param ctx the parse tree
	 */
	void enterExperience(ResumeParser.ExperienceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#experience}.
	 * @param ctx the parse tree
	 */
	void exitExperience(ResumeParser.ExperienceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#education}.
	 * @param ctx the parse tree
	 */
	void enterEducation(ResumeParser.EducationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#education}.
	 * @param ctx the parse tree
	 */
	void exitEducation(ResumeParser.EducationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#skills}.
	 * @param ctx the parse tree
	 */
	void enterSkills(ResumeParser.SkillsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#skills}.
	 * @param ctx the parse tree
	 */
	void exitSkills(ResumeParser.SkillsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#pertype}.
	 * @param ctx the parse tree
	 */
	void enterPertype(ResumeParser.PertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#pertype}.
	 * @param ctx the parse tree
	 */
	void exitPertype(ResumeParser.PertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#edutype}.
	 * @param ctx the parse tree
	 */
	void enterEdutype(ResumeParser.EdutypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#edutype}.
	 * @param ctx the parse tree
	 */
	void exitEdutype(ResumeParser.EdutypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#exptype}.
	 * @param ctx the parse tree
	 */
	void enterExptype(ResumeParser.ExptypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#exptype}.
	 * @param ctx the parse tree
	 */
	void exitExptype(ResumeParser.ExptypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#skitype}.
	 * @param ctx the parse tree
	 */
	void enterSkitype(ResumeParser.SkitypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#skitype}.
	 * @param ctx the parse tree
	 */
	void exitSkitype(ResumeParser.SkitypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResumeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ResumeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResumeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ResumeParser.ValueContext ctx);
}