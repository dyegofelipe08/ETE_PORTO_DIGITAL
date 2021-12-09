import javax.swing.JFormattedTextField;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComponent;

public class Data2
{
	private JFormattedTextField vData;
	private GregorianCalendar data=new GregorianCalendar();

	public JComponent tela()
	{
		javax.swing.JPanel painel=new javax.swing.JPanel();
		painel.setLayout(new java.awt.FlowLayout());
		vData=new JFormattedTextField(DateFormat.getDateInstance(DateFormat.MEDIUM));
		vData.setText(data.get(Calendar.DAY_OF_MONTH)+"/"+(data.get(Calendar.MONTH)+1)+"/"+(data.get(Calendar.YEAR)));
		vData.setColumns(6);

		painel.add(vData);
		return painel;
	}

	public static void main(String[] args)
	{
		javax.swing.JFrame frame=new javax.swing.JFrame();
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		Data2 d=new Data2();
		frame.add(d.tela());
		frame.setSize(100,100);
		frame.setVisible(true);
	}
}
