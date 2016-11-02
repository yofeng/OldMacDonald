class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound)
	{
		myName = name;
		myType = type;
		mySound = sound;
		//initialize all variables because they're protected in the Cow class
	}
	public String getName()
	{
		return myName;
	}
}