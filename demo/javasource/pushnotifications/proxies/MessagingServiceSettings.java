// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public class MessagingServiceSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject messagingServiceSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PushNotifications.MessagingServiceSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Enabled("Enabled");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MessagingServiceSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PushNotifications.MessagingServiceSettings"));
	}

	protected MessagingServiceSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messagingServiceSettingsMendixObject)
	{
		if (messagingServiceSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("PushNotifications.MessagingServiceSettings", messagingServiceSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PushNotifications.MessagingServiceSettings");

		this.messagingServiceSettingsMendixObject = messagingServiceSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MessagingServiceSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.MessagingServiceSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pushnotifications.proxies.MessagingServiceSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.MessagingServiceSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("PushNotifications.APNSettings", mendixObject.getType()))
			return pushnotifications.proxies.APNSettings.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("PushNotifications.GCMSettings", mendixObject.getType()))
			return pushnotifications.proxies.GCMSettings.initialize(context, mendixObject);

		return new pushnotifications.proxies.MessagingServiceSettings(context, mendixObject);
	}

	public static pushnotifications.proxies.MessagingServiceSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.MessagingServiceSettings.initialize(context, mendixObject);
	}

	public static java.util.List<? extends pushnotifications.proxies.MessagingServiceSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<pushnotifications.proxies.MessagingServiceSettings> result = new java.util.ArrayList<pushnotifications.proxies.MessagingServiceSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//PushNotifications.MessagingServiceSettings" + xpathConstraint))
			result.add(pushnotifications.proxies.MessagingServiceSettings.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Enabled
	 */
	public final Boolean getEnabled()
	{
		return getEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of Enabled
	 */
	public final Boolean getEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Enabled.toString());
	}

	/**
	 * Set value of Enabled
	 * @param enabled
	 */
	public final void setEnabled(Boolean enabled)
	{
		setEnabled(getContext(), enabled);
	}

	/**
	 * Set value of Enabled
	 * @param context
	 * @param enabled
	 */
	public final void setEnabled(com.mendix.systemwideinterfaces.core.IContext context, Boolean enabled)
	{
		getMendixObject().setValue(context, MemberNames.Enabled.toString(), enabled);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return messagingServiceSettingsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
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
			final pushnotifications.proxies.MessagingServiceSettings that = (pushnotifications.proxies.MessagingServiceSettings) obj;
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
	public static java.lang.String getType()
	{
		return "PushNotifications.MessagingServiceSettings";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
