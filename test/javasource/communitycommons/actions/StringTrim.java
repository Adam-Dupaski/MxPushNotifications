// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Left and right trims a string (that is; removes all surrounding whitespace characters such as tabs, spaces and returns). 
 * Returns the empty string if value is the empty value. Returns the trimmed string otherwise.
 */
public class StringTrim extends CustomJavaAction<java.lang.String>
{
	private java.lang.String value;

	public StringTrim(IContext context, java.lang.String value)
	{
		super(context);
		this.value = value;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (this.value == null)
			return "";
		return this.value.trim();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StringTrim";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
