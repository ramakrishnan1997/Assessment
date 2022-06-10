import java.util.Objects;

public class Car {
	int RegNumber ;
	int Model;
	int count=0;
public Car(int regNumber, int model) {
		super();
		RegNumber = regNumber;
		Model = model;
	}

public int getRegNumber() {
	return RegNumber;
}
public void setRegNumber(int regNumber) {
	RegNumber = regNumber;
	count++;
}
public int getModel() {
	return Model;
}
public void setModel(int model) {
	Model = model;
	count++;
}

@Override
public int hashCode() {
	return Objects.hash(Model, RegNumber);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	return Model == other.Model && RegNumber == other.RegNumber;
}

@Override
public String toString() {
	return "Car [RegNumber=" + RegNumber + ", Model=" + Model + "]";
}
public String getCount()
{
	return "Counter :"+count;
}

}
