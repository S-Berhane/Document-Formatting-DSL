import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.TokenStream;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import com.resumecompiler.parser.ResumeBaseListener;
import com.resumecompiler.parser.ResumeParser;
import com.resumecompiler.parser.ResumeParser.CommandContext;
import com.resumecompiler.parser.ResumeParser.EducationContext;
import com.resumecompiler.parser.ResumeParser.ExperienceContext;
import com.resumecompiler.parser.ResumeParser.PersonalContext;
import com.resumecompiler.parser.ResumeParser.SkillsContext;
import com.resumecompiler.parser.ResumeParser.StartruleContext;


/**
 * @author Simon Berhane
 * This class is an extension of ResumeBaseListener. It's purpose is to listen on specific 
 * tree walking events, and grab that information. The information is added to an HTML object, and
 * eventually used to generate the output HTML. 
 */
public class ResumeListener extends ResumeBaseListener {
	private Document doc;
	ResumeParser parser;
	public int count = 0;
	public int expCount = 0;
	public int eduCount = 0;
	public int perCount = 0;
	public int skillsCount = 0;
	Elements currentElement;
	Element templateElement;
	List<Elements> exp;
	List<Elements> edu;
	List<Elements> per;
	List<Elements> ski;
	public ResumeListener(Document doc) {
		this.doc = doc;
		this.exp = new ArrayList<Elements>();
		this.edu = new ArrayList<Elements>();
		this.per = new ArrayList<Elements>();
		this.ski = new ArrayList<Elements>();
	}
	public void sort(List<Elements> a) {
		Collections.sort(a, new Comparator<Elements>() {
			@Override
			public int compare(Elements o1, Elements o2) {
				// TODO Auto-generated method stub
				int v1 = Integer.parseInt(o1.get(0).attr("data-order"));
				int v2 = Integer.parseInt(o2.get(0).attr("data-order"));
				if(v2 > v1) return 1;
				else if(v2 == v1) return 0;
				return -1;
			}
	    });
	}
	@Override
	public void exitStartrule(StartruleContext ctx) {
		//sort each section
		sort(exp);
		sort(edu);
		sort(per);
		sort(ski);
		for (Elements e : exp)
			doc.getElementsByAttributeValue("data-id", "experience-template").after(e.toString());
		for (Elements e : edu)
			doc.getElementsByAttributeValue("data-id", "education-template").after(e.toString());
		for (Elements e : per)
			doc.getElementsByAttributeValue("data-id", "personal-template").after(e.toString());
		for (Elements e : ski)
			doc.getElementsByAttributeValue("data-id", "skills-template").after(e.toString());
		//Remove all the templates in document
		doc.getElementsByAttributeValue("data-id", "education-template").remove();
		doc.getElementsByAttributeValue("data-id", "experience-template").remove();
		doc.getElementsByAttributeValue("data-id", "personal-template").remove();
		doc.getElementsByAttributeValue("data-id", "skills-template").remove();
	}
	/* (non-Javadoc)
	 * @see com.resumecompiler.parser.ResumeBaseListener#enterCommand(com.resumecompiler.parser.ResumeParser.CommandContext)
	 */
	@Override
	public void enterCommand(CommandContext ctx) {
		//initialize template
		if(ctx.action().getText().equals("start")) {
			currentElement = doc.getElementsByAttributeValue("data-id", ctx.texttype().getText()+"-template").clone();
			//a = currentElement.clone();
			System.out.println("Object initialized of type "+ctx.texttype().getText());
			//which type?
			switch (ctx.texttype().getText()) {
				case "experience" :
					expCount++;
					if(ctx.ORDER() != null) {
						currentElement.get(0).attr("data-order", ctx.ORDER().getText());
					}
					currentElement.get(0).attr("data-id", "experience_".concat(Integer.toString(expCount)));
					break;
				case "education" :
					eduCount++;
					if(ctx.ORDER() != null) {
						currentElement.get(0).attr("data-order", ctx.ORDER().getText());
					}
					currentElement.get(0).attr("data-id", "education_".concat(Integer.toString(eduCount)));
					break;
				case "personal" :
					perCount++;
					if(ctx.ORDER() != null) {
						currentElement.get(0).attr("data-order", ctx.ORDER().getText());
					}
					currentElement.get(0).attr("data-id", "personal_".concat(Integer.toString(perCount)));
					break;
				case "skills" :
					skillsCount++;
					if(ctx.ORDER() != null) {
						currentElement.get(0).attr("data-order", ctx.ORDER().getText());
					}
					currentElement.get(0).attr("data-id", "skills_"+skillsCount);
					break;
			}
		}
		//nullify global object
		if(ctx.action().getText().equals("stop")) {
			switch (ctx.texttype().getText()) {
				case "experience" :
					exp.add(currentElement);
					break;
				case "education" :
					edu.add(currentElement);
					break;
				case "personal" :
					per.add(currentElement);
					break;
				case "skills" :
					ski.add(currentElement);
					break;
			}
			//System.out.println("What is this?\n" + a);
			//doc.getElementsByAttributeValue("data-id", ctx.texttype().getText()+"-template").after(currentElement.get(0).toString());
			currentElement = null;
			System.out.println("Object has been cleaned.");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.resumecompiler.parser.ResumeBaseListener#enterExperience(com.resumecompiler.parser.ResumeParser.ExperienceContext)
	 */
	@Override
	
	public void enterExperience(ExperienceContext ctx) {
		currentElement.get(0).getElementsByAttributeValue("data-type",ctx.exptype().getText())
		.html(ctx.value().getText());
		
	}
	/* (non-Javadoc)
	 * @see com.resumecompiler.parser.ResumeBaseListener#enterEducation(com.resumecompiler.parser.ResumeParser.EducationContext)
	 */
	@Override
	
	public void enterEducation(EducationContext ctx) {
		System.out.println(ctx.value().getText());
		currentElement.get(0).getElementsByAttributeValue("data-type",ctx.edutype().getText())
		.html(ctx.value().getText());
	}
	/* (non-Javadoc)
	 * @see com.resumecompiler.parser.ResumeBaseListener#enterPersonal(com.resumecompiler.parser.ResumeParser.PersonalContext)
	 */
	@Override
	
	public void enterPersonal(PersonalContext ctx) {
		currentElement.get(0).getElementsByAttributeValue("data-type",ctx.pertype().getText())
		.html(ctx.value().getText());
	}
	/* (non-Javadoc)
	 * @see com.resumecompiler.parser.ResumeBaseListener#enterSkills(com.resumecompiler.parser.ResumeParser.SkillsContext)
	 */
	@Override
	public void enterSkills(SkillsContext ctx) {
		currentElement.get(0).getElementsByAttributeValue("data-type",ctx.skitype().getText())
		.html(ctx.value().getText());
	}
}
