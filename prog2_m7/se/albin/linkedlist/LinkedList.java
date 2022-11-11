package se.albin.linkedlist;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	private int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public void add(T element) {
		Node<T> node = new Node<T>(element);
		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}

		size++;
	}

	public T get(int pos) {
		if (pos >= size) {
			throw new IndexOutOfBoundsException("size = " + size);
		}
		Node<T> temp = head;
		for (int i = 0; i < pos; i++) {
			temp = temp.next;
		}
		return (T) temp.getElement();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public void clear() {
		if (head != null) {
			head = null;
			tail = null;
			size = 0;
		}
	}

	public T removeLast() {
		Node<T> temp = head;
		Node<T> removedNode = null;

		if (head == null)
			throw new NullPointerException("List is empty");
		if (head.next == null) {
			removedNode = head;
			head = tail = null;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			removedNode = temp.next;
			tail = temp;
			tail.next = null;
		}
		size--;

		return removedNode.getElement();
	}

	public T removeFirst() {
		Node<T> removedNode = head;
		head = head.next;
		size--;
		return removedNode.getElement();
	}

	public T remove(int pos) {
		Node<T> temp = head;
		Node<T> removedNode = null;

		if (pos == 0) {
			return removeFirst();
		} else if (pos == size - 1) {
			return removeLast();
		} else {
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
			removedNode = temp.next;
			temp.next = temp.next.next;
			size--;

			return removedNode.getElement();
		}
	}

	public void insert(int pos, T element) {
		Node<T> temp = head;
		if (size == 0 || size == pos) {
			add(element);
		} else if (pos == 0) {
			addFirst(element);
		} else {
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
			Node<T> addedObj = new Node<T>(element);
			addedObj.next = temp.next;
			temp.next = addedObj;
			size++;
		}
	}

	public void addFirst(T element) {

		Node<T> temp = head;
		Node<T> addedObj = new Node<T>(element);
		if (size == 0) {
			add(element);
		} else {
			head = addedObj;
			addedObj.next = temp;
			size++;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1); // 0
		list.add(2); // 1
		list.add(3); // 2
		list.add(4); // 3
		list.insert(4, 10);

		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i));
		}
	}

}
