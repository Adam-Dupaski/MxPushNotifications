// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Message
{
	private final IMendixObject messageMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PushNotifications.Message";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DeviceType("DeviceType"),
		To("To"),
		MessageId("MessageId"),
		Message("Message"),
		Failed("Failed"),
		FailedReason("FailedReason"),
		FailedCount("FailedCount"),
		NextTry("NextTry"),
		Queued("Queued");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Message(IContext context)
	{
		this(context, Core.instantiate(context, "PushNotifications.Message"));
	}

	protected Message(IContext context, IMendixObject messageMendixObject)
	{
		if (messageMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PushNotifications.Message", messageMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PushNotifications.Message");

		this.messageMendixObject = messageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Message.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.Message initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return pushnotifications.proxies.Message.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.Message initialize(IContext context, IMendixObject mendixObject)
	{
		if (Core.isSubClassOf("PushNotifications.AppleMessage", mendixObject.getType()))
			return pushnotifications.proxies.AppleMessage.initialize(context, mendixObject);

		if (Core.isSubClassOf("PushNotifications.GoogleMessage", mendixObject.getType()))
			return pushnotifications.proxies.GoogleMessage.initialize(context, mendixObject);

		return new pushnotifications.proxies.Message(context, mendixObject);
	}

	public static pushnotifications.proxies.Message load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.Message.initialize(context, mendixObject);
	}

	public static java.util.List<? extends pushnotifications.proxies.Message> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<pushnotifications.proxies.Message> result = new java.util.ArrayList<pushnotifications.proxies.Message>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PushNotifications.Message" + xpathConstraint))
			result.add(pushnotifications.proxies.Message.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType()
	{
		return getDeviceType(getContext());
	}

	/**
	 * @param context
	 * @return value of DeviceType
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DeviceType.toString());
		if (obj == null)
			return null;

		return pushnotifications.proxies.DeviceType.valueOf((String) obj);
	}

	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final void setDeviceType(pushnotifications.proxies.DeviceType devicetype)
	{
		setDeviceType(getContext(), devicetype);
	}

	/**
	 * Set value of DeviceType
	 * @param context
	 * @param devicetype
	 */
	public final void setDeviceType(IContext context, pushnotifications.proxies.DeviceType devicetype)
	{
		if (devicetype != null)
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), devicetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), null);
	}

	/**
	 * @return value of To
	 */
	public final String getTo()
	{
		return getTo(getContext());
	}

	/**
	 * @param context
	 * @return value of To
	 */
	public final String getTo(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.To.toString());
	}

	/**
	 * Set value of To
	 * @param to
	 */
	public final void setTo(String to)
	{
		setTo(getContext(), to);
	}

	/**
	 * Set value of To
	 * @param context
	 * @param to
	 */
	public final void setTo(IContext context, String to)
	{
		getMendixObject().setValue(context, MemberNames.To.toString(), to);
	}

	/**
	 * @return value of MessageId
	 */
	public final String getMessageId()
	{
		return getMessageId(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageId
	 */
	public final String getMessageId(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.MessageId.toString());
	}

	/**
	 * Set value of MessageId
	 * @param messageid
	 */
	public final void setMessageId(String messageid)
	{
		setMessageId(getContext(), messageid);
	}

	/**
	 * Set value of MessageId
	 * @param context
	 * @param messageid
	 */
	public final void setMessageId(IContext context, String messageid)
	{
		getMendixObject().setValue(context, MemberNames.MessageId.toString(), messageid);
	}

	/**
	 * @return value of Message
	 */
	public final String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final String getMessage(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(IContext context, String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of Failed
	 */
	public final Boolean getFailed()
	{
		return getFailed(getContext());
	}

	/**
	 * @param context
	 * @return value of Failed
	 */
	public final Boolean getFailed(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Failed.toString());
	}

	/**
	 * Set value of Failed
	 * @param failed
	 */
	public final void setFailed(Boolean failed)
	{
		setFailed(getContext(), failed);
	}

	/**
	 * Set value of Failed
	 * @param context
	 * @param failed
	 */
	public final void setFailed(IContext context, Boolean failed)
	{
		getMendixObject().setValue(context, MemberNames.Failed.toString(), failed);
	}

	/**
	 * @return value of FailedReason
	 */
	public final String getFailedReason()
	{
		return getFailedReason(getContext());
	}

	/**
	 * @param context
	 * @return value of FailedReason
	 */
	public final String getFailedReason(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FailedReason.toString());
	}

	/**
	 * Set value of FailedReason
	 * @param failedreason
	 */
	public final void setFailedReason(String failedreason)
	{
		setFailedReason(getContext(), failedreason);
	}

	/**
	 * Set value of FailedReason
	 * @param context
	 * @param failedreason
	 */
	public final void setFailedReason(IContext context, String failedreason)
	{
		getMendixObject().setValue(context, MemberNames.FailedReason.toString(), failedreason);
	}

	/**
	 * @return value of FailedCount
	 */
	public final Integer getFailedCount()
	{
		return getFailedCount(getContext());
	}

	/**
	 * @param context
	 * @return value of FailedCount
	 */
	public final Integer getFailedCount(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.FailedCount.toString());
	}

	/**
	 * Set value of FailedCount
	 * @param failedcount
	 */
	public final void setFailedCount(Integer failedcount)
	{
		setFailedCount(getContext(), failedcount);
	}

	/**
	 * Set value of FailedCount
	 * @param context
	 * @param failedcount
	 */
	public final void setFailedCount(IContext context, Integer failedcount)
	{
		getMendixObject().setValue(context, MemberNames.FailedCount.toString(), failedcount);
	}

	/**
	 * @return value of NextTry
	 */
	public final java.util.Date getNextTry()
	{
		return getNextTry(getContext());
	}

	/**
	 * @param context
	 * @return value of NextTry
	 */
	public final java.util.Date getNextTry(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.NextTry.toString());
	}

	/**
	 * Set value of NextTry
	 * @param nexttry
	 */
	public final void setNextTry(java.util.Date nexttry)
	{
		setNextTry(getContext(), nexttry);
	}

	/**
	 * Set value of NextTry
	 * @param context
	 * @param nexttry
	 */
	public final void setNextTry(IContext context, java.util.Date nexttry)
	{
		getMendixObject().setValue(context, MemberNames.NextTry.toString(), nexttry);
	}

	/**
	 * @return value of Queued
	 */
	public final Boolean getQueued()
	{
		return getQueued(getContext());
	}

	/**
	 * @param context
	 * @return value of Queued
	 */
	public final Boolean getQueued(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Queued.toString());
	}

	/**
	 * Set value of Queued
	 * @param queued
	 */
	public final void setQueued(Boolean queued)
	{
		setQueued(getContext(), queued);
	}

	/**
	 * Set value of Queued
	 * @param context
	 * @param queued
	 */
	public final void setQueued(IContext context, Boolean queued)
	{
		getMendixObject().setValue(context, MemberNames.Queued.toString(), queued);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return messageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.Message that = (pushnotifications.proxies.Message) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "PushNotifications.Message";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
