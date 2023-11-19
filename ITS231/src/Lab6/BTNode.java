package Lab6;

public class BTNode<T>
{
	public T element;
	public BTNode<T> left = null;
	public BTNode<T> right = null;

	public BTNode(T e)
	{
		element = e;
	}
}