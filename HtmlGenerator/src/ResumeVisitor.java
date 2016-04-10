
import com.resumecompiler.parser.*;
import com.resumecompiler.parser.ResumeParser.EducationContext;

public class ResumeVisitor extends ResumeBaseVisitor {

	@Override
	public Object visitEducation(EducationContext ctx) {
//		// TODO Auto-generated method stub
//		return super.visitEducation(ctx);
		System.out.println(ctx.getChildCount());
		System.out.println(ctx.getChild(0));
		return null;
	}
}
