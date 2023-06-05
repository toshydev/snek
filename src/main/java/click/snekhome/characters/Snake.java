package click.snekhome.characters;

import click.snekhome.util.Direction;

public class Snake {
    private SnakeNode head;
    private SnakeNode tail;
    private int length;

    public Snake(int initLength, int startX, int startY) {
        head = new SnakeNode(startX, startY);
        tail = head;
        length = initLength;

        for (int i = 1; i < initLength; i++) {
            SnakeNode newNode = new SnakeNode(startX + 1, startY);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public boolean checkNodes(int x, int y) {
        SnakeNode current = head;
        while(current.getNext() != null) {
            if (current.getPosX() == x && current.getPosY() == y) {
                return true;
            } else {
                current = current.getNext();
            }
        }
        return false;
    }

    public void move(Direction direction) {
        int newX = head.getPosX();
        int newY = head.getPosY();

        switch (direction) {
            case UP:
                newY--;
                break;
            case DOWN:
                newY++;
                break;
            case LEFT:
                newX--;
                break;
            case RIGHT:
                newX++;
                break;
        }

        SnakeNode newHead = new SnakeNode(newX, newY);
        newHead.setNext(head);
        head.setPrev(newHead);
        head = newHead;

        if (tail.getPrev() != null) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            tail = newHead;
        }
    }

    public void eat() {
        SnakeNode newTail = new SnakeNode(tail.getPosX(), tail.getPosY());
        tail.setNext(newTail);
        newTail.setPrev(tail);
        tail = newTail;
        length++;
    }

    public int getLength() {
        return length;
    }


    public static class SnakeNode {
        private int posX;
        private int posY;
        private SnakeNode prev;
        private SnakeNode next;

        public SnakeNode(int posX, int posY) {
            this.posX = posX;
            this.posY = posY;
        }

        public int getPosX() {
            return posX;
        }

        public int getPosY() {
            return posY;
        }

        public SnakeNode getPrev() {
            return prev;
        }

        public void setPrev(SnakeNode prev) {
            this.prev = prev;
        }

        public SnakeNode getNext() {
            return next;
        }

        public void setNext(SnakeNode next) {
            this.next = next;
        }

    }
}
