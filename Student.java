class Student {
	String index;
	String firstName;
	String lastName;
	List<int> labPoints;
	//TODO constructor
	public Student()
	{
		labPoints= new List<int>();
	}

	public String getLastName() {
		return lastName;
	}

	public List<int> getLabPoints() {
		return labPoints;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(List<int> labPoints) {
		this.labPoints = labPoints;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public double getAverage(List<int> labPoints) {
		double average=0;
		int count=0;
		for(int i : labPoints)
		{
			average+=i;
			count++;
		}
		return average/count;
	}

	public boolean hasSignature(List<int> labPoints) {
		int count=0;
		for(int i : labPoints)
		{
			count++;
		}
		if(count>8)
			return true;
		else return false;
	}
}
