import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Project extends JFrame {

	JPanel panel, paint;

	JButton pencil, eraser, erase;

	JButton color;

	JLabel thick_label;

	JTextField thick_field; // ���� ���Ⱑ ������ �ؽ�Ʈ �ʵ�

	Color selectedColor;

	Graphics graphics; // Graphics 2D Ŭ������ ����� ���� ����

	Graphics2D g; // ���� Graphics�� ��������

	int thick = 10;

	int a;

	int startX;

	int startY;

	int endX;

	int endY;

	boolean tf = false;

	public Project() {

		setLayout(null);

		setTitle("�׸���");

		setSize(900, 750);

		setLocationRelativeTo(null); // ���α׷� ���۽� ȭ�� �߾ӿ� ��µ�.

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		panel.setBackground(Color.GRAY);

		panel.setLayout(null); // panel�� ���̾ƿ��� null�� �����Ͽ� ������Ʈ ��ġ�� ���� ������ �� ����.

		ImageIcon icon = new ImageIcon("D:\\p.png"); // ���� ��ư ����

		Image img = icon.getImage();

		Image changeimage = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		ImageIcon changeicon = new ImageIcon(changeimage);

		pencil = new JButton(changeicon);

		pencil.setFont(new Font("Serif", Font.BOLD, 25)); // ��ư��Ʈ ũ�� �� �۾� ũ�� ����

		pencil.setBackground(Color.LIGHT_GRAY);

		ImageIcon icon2 = new ImageIcon("D:\\e.jpg"); // ���찳 ��ư ����

		Image img2 = icon2.getImage();

		Image changeimage2 = img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		ImageIcon changeicon2 = new ImageIcon(changeimage2);

		eraser = new JButton(changeicon2);

		eraser.setFont(new Font("Serif", Font.BOLD, 25)); // ��ư ��Ʈ ũ�� �� �۾� ũ�� ����

		eraser.setBackground(Color.WHITE);

		color = new JButton("����"); // �� ���� ��ư ����

		color.setBackground(Color.YELLOW);

		erase = new JButton("��������"); // �������� ��ư ����

		erase.setFont(new Font("Serif", Font.BOLD, 25));

		erase.setBackground(Color.WHITE);

		thick_label = new JLabel("����"); // ���� ���� �� ����

		thick_label.setFont(new Font("Serif", Font.BOLD, 20)); // ���� ���� �� ��Ʈ �� �۾� ũ�� ����

		thick_field = new JTextField(Integer.toString(thick), 5); // ���� ���� �Է� �ؽ�Ʈ �ʵ� ����

		thick_field.setHorizontalAlignment(JTextField.CENTER);

		thick_field.setFont(new Font("Serif", Font.PLAIN, 25));

		pencil.setBounds(10, 10, 90, 55); // ���� ��ư ��ġ ����

		eraser.setBounds(105, 10, 109, 55); // ���찳 ��ư ��ġ ����

		erase.setBounds(220, 10, 180, 55); // ��� ����� ��ư ��ġ ����

		color.setBounds(785, 10, 90, 55); // ������ ��ư ��ġ ����

		thick_label.setBounds(640, 10, 100, 55); // ���� ���� �� ��ġ ����

		thick_field.setBounds(720, 22, 50, 35); // ���� ���� �ؽ�Ʈ �ʵ� ��ġ ����

		panel.add(pencil); // panel�� ���� ��ư �߰�

		panel.add(eraser); // panel�� ���찳 ��ư �߰�

		panel.add(erase); // panel�� ��� ����� ��ư �߰�

		panel.add(color); // panel�� ������ ��ư �߰�

		panel.add(thick_label); // panel�� �������� �� �߰�

		panel.add(thick_field); // panel�� �������� �ؽ�Ʈ ��Ʈ �߰�

		panel.setBounds(0, 0, 900, 75); // panel�� �����ӿ� ��ġ�� ��ġ ����

		paint = new JPanel(); // �׸��� �׷��� �г� ����

		paint.setBackground(Color.WHITE);

		paint.setLayout(null); // paint�� ���̾ƿ��� null���� �г� ��ü�� setBounds�� ��ġ�� ���� �� �� �ֵ��� ��.

		paint.setBounds(0, 90, 885, 620); // paint �г��� ��ġ ����

		add(panel); // ���������ӿ� ���� �г� �߰� - ��ġ�� ������ �� ������.

		add(paint); // ���������ӿ� ��ȭ�� �г� �߰� - ��ġ�� ������ �� ������

		setFocusable(true); // ����Ʈ ���� ��Ŀ���� ���� �� �ֵ��� ����

		requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ����

		setVisible(true); // ������������ ���̰� ��.

		graphics = getGraphics(); // �׷��� �ʱ�ȭ

		g = (Graphics2D) graphics;

		g.setColor(selectedColor);

		addKeyListener(new KeyListener() { // key������ �߰�

			public void keyPressed(KeyEvent e) {

				switch (e.getKeyChar()) {

				case '[': // '[' ��ư ���� �� �� ���Ⱑ 10��ŭ �پ��

					a = a - 10;

					thick_field.setText(Integer.toString(a));

					break;

				case ']': // ']' ��ư ���� �� �� ���Ⱑ 10��ŭ �þ

					a = a + 10;

					thick_field.setText(Integer.toString(a));

					break;

				case 'q': // 'q'��ư�� ���� �� �г� ����

					System.exit(0);

				}

			}

			@Override

			public void keyReleased(KeyEvent e) {

				// TODO Auto-generated method stub

			}

			@Override

			public void keyTyped(KeyEvent e) {

				// TODO Auto-generated method stub

			}

		});

		paint.addMouseListener(new MouseListener() { // MouseListener �̺�Ʈ ó��

			public void mousePressed(MouseEvent e) {

				startX = e.getX(); // ���콺�� �������� �׶��� X��ǥ������ �ʱ�ȭ

				startY = e.getY(); // ���콺�� �������� �׶��� Y��ǥ������ �ʱ�ȭ

			}

			public void mouseClicked(MouseEvent e) {
			} // Ŭ���̺�Ʈ ó��

			public void mouseEntered(MouseEvent e) {
			} // paint(��ȭ��) ���� ���� ���Խ� �̺�Ʈ ó��

			public void mouseExited(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}

		});

		paint.addMouseMotionListener(new PaintDraw()); // �׸� �׷��� �гο� ���콺 ��� ������ �߰�

		pencil.addActionListener(new ToolActionListener()); // ���ʹ�ư �׼�ó��

		eraser.addActionListener(new ToolActionListener()); // ���찳 ��ư �̹�Ʈ ó��

		erase.addActionListener(new ToolActionListener()); // �������� ��ư �̺�Ʈ ó��

		color.addActionListener(new ActionListener() { /// �������ư �׼�ó���� �͸� Ŭ������ ����

			public void actionPerformed(ActionEvent e) { //// �������̵�

				tf = true;

				JColorChooser chooser = new JColorChooser();

				selectedColor = chooser.showDialog(null, "Color", Color.ORANGE);

				g.setColor(selectedColor);

			}

		}); ///

	}

	public class PaintDraw implements MouseMotionListener {

		public void mouseDragged(MouseEvent e) { // paint �гο��� ���콺 �巡�� �׼��� ó���ɋ� �żҵ� ����

			thick = Integer.parseInt(thick_field.getText());

			endX = e.getX();

			endY = e.getY();

			g.setStroke(new BasicStroke(thick, BasicStroke.CAP_ROUND, 0));

			g.drawLine(startX + 10, startY + 121, endX + 10, endY + 121);

			startX = endX;

			startY = endY;

		}

		@Override

		public void mouseMoved(MouseEvent e) {
		}

	}

	public class ToolActionListener implements ActionListener { // ����,���찳, �������� ��ư�� �׼�ó���� ����Ǵ� Ŭ����

		public void actionPerformed(ActionEvent e) { // ���� ���̵� �� actionPerformed �޼ҵ� ����

			if (e.getSource() == pencil) {

				if (tf == false)
					g.setColor(Color.BLACK); // �켱 ���� ���������� ����

				else
					g.setColor(selectedColor);

			}

			else if (e.getSource() == eraser) {

				g.setColor(Color.WHITE); // �׷��������찳 ���� ������� ���� -> ������� ���̴� ��ó�� ���̰� ��.

			}

			else if (e.getSource() == erase) {

				repaint();

			}

		}

	}

	public static void main(String[] args) {

		new Project();

	}

}