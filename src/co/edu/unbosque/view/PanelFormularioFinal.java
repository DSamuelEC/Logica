package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelFormularioFinal extends JPanel {
	private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
	private JCheckBox cb1SI, cb1NO, cb2SI, cb2NO, cb3SI, cb3NO, cb4SI, cb4NO;
	private JCheckBox cb5SI, cb5NO, cb6SI, cb6NO, cb7SI, cb7NO, cb8SI, cb8NO;
	private JButton btnFinalizar, btnVolver;

	public PanelFormularioFinal() {
		setLayout(null);
		setBackground(new Color(129, 246, 209));
		setBounds(50, 50, 600, 900);

		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		lbl1 = new JLabel("¿Realizas ejercicio físico durante el día?");
		lbl1.setBounds(20, 20, 400, 50);
		cb1SI = new JCheckBox("SI");
		cb1SI.setBounds(450, 20, 50, 50);
		cb1NO = new JCheckBox("NO");
		cb1NO.setBounds(510, 20, 50, 50);
		cambiarChecks(cb1SI, cb1NO);
		add(lbl1);
		add(cb1SI);
		add(cb1NO);

		lbl2 = new JLabel("¿Te expones a la luz natural durante el día?");
		lbl2.setBounds(20, 80, 400, 50);
		cb2SI = new JCheckBox("SI");
		cb2SI.setBounds(450, 80, 50, 50);
		cb2NO = new JCheckBox("NO");
		cb2NO.setBounds(510, 80, 50, 50);
		cambiarChecks(cb2SI, cb2NO);
		add(lbl2);
		add(cb2SI);
		add(cb2NO);

		lbl3 = new JLabel("¿Consumes alimentos pesados o cenas tarde en la noche?");
		lbl3.setBounds(20, 140, 400, 50);
		cb3SI = new JCheckBox("SI");
		cb3SI.setBounds(450, 140, 50, 50);
		cb3NO = new JCheckBox("NO");
		cb3NO.setBounds(510, 140, 50, 50);
		cambiarChecks(cb3SI, cb3NO);
		add(lbl3);
		add(cb3SI);
		add(cb3NO);

		lbl4 = new JLabel("¿Tu dormitorio está oscuro y en silencio antes de dormir?");
		lbl4.setBounds(20, 200, 400, 50);
		cb4SI = new JCheckBox("SI");
		cb4SI.setBounds(450, 200, 50, 50);
		cb4NO = new JCheckBox("NO");
		cb4NO.setBounds(510, 200, 50, 50);
		add(lbl4);
		add(cb4SI);
		add(cb4NO);

		lbl5 = new JLabel("¿Mantienes una temperatura fresca en tu habitación al dormir?");
		lbl5.setBounds(20, 260, 400, 50);
		cb5SI = new JCheckBox("SI");
		cb5SI.setBounds(450, 260, 50, 50);
		cb5NO = new JCheckBox("NO");
		cb5NO.setBounds(510, 260, 50, 50);
		add(lbl5);
		add(cb5SI);
		add(cb5NO);

		lbl6 = new JLabel("¿Te despiertas a la misma hora cada día, incluso los fines de semana?");
		lbl6.setBounds(20, 320, 400, 50);
		cb6SI = new JCheckBox("SI");
		cb6SI.setBounds(450, 320, 50, 50);
		cb6NO = new JCheckBox("NO");
		cb6NO.setBounds(510, 320, 50, 50);
		add(lbl6);
		add(cb6SI);
		add(cb6NO);

		lbl7 = new JLabel("¿Consumes cafeína o estimulantes cerca de la hora de dormir?");
		lbl7.setBounds(20, 380, 400, 50);
		cb7SI = new JCheckBox("SI");
		cb7SI.setBounds(450, 380, 50, 50);
		cb7NO = new JCheckBox("NO");
		cb7NO.setBounds(510, 380, 50, 50);
		add(lbl7);
		add(cb7SI);
		add(cb7NO);

		lbl8 = new JLabel("¿Usas dispositivos electrónicos antes de dormir?");
		lbl8.setBounds(20, 440, 400, 50);
		cb8SI = new JCheckBox("SI");
		cb8SI.setBounds(450, 440, 50, 50);
		cb8NO = new JCheckBox("NO");
		cb8NO.setBounds(510, 440, 50, 50);
		add(lbl8);
		add(cb8SI);
		add(cb8NO);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(450, 500, 100, 30);
		btnFinalizar.setActionCommand("BTN_FINALIZAR");
		add(btnFinalizar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(20, 500, 100, 30);
		btnVolver.setActionCommand("BTN_VOLVER");
		add(btnVolver);
	}

	public void cambiarChecks(JCheckBox checkSI, JCheckBox checkNO) {
		checkSI.addActionListener(e -> {
			if (checkSI.isSelected()) {
				checkNO.setSelected(false);
			}
		});

		checkNO.addActionListener(e -> {
			if (checkNO.isSelected()) {
				checkSI.setSelected(false);
			}
		});
	}

	public JLabel getLbl1() {
		return lbl1;
	}

	public void setLbl1(JLabel lbl1) {
		this.lbl1 = lbl1;
	}

	public JLabel getLbl2() {
		return lbl2;
	}

	public void setLbl2(JLabel lbl2) {
		this.lbl2 = lbl2;
	}

	public JLabel getLbl3() {
		return lbl3;
	}

	public void setLbl3(JLabel lbl3) {
		this.lbl3 = lbl3;
	}

	public JLabel getLbl4() {
		return lbl4;
	}

	public void setLbl4(JLabel lbl4) {
		this.lbl4 = lbl4;
	}

	public JLabel getLbl5() {
		return lbl5;
	}

	public void setLbl5(JLabel lbl5) {
		this.lbl5 = lbl5;
	}

	public JLabel getLbl6() {
		return lbl6;
	}

	public void setLbl6(JLabel lbl6) {
		this.lbl6 = lbl6;
	}

	public JLabel getLbl7() {
		return lbl7;
	}

	public void setLbl7(JLabel lbl7) {
		this.lbl7 = lbl7;
	}

	public JLabel getLbl8() {
		return lbl8;
	}

	public void setLbl8(JLabel lbl8) {
		this.lbl8 = lbl8;
	}

	public JCheckBox getCb1SI() {
		return cb1SI;
	}

	public void setCb1SI(JCheckBox cb1si) {
		cb1SI = cb1si;
	}

	public JCheckBox getCb1NO() {
		return cb1NO;
	}

	public void setCb1NO(JCheckBox cb1no) {
		cb1NO = cb1no;
	}

	public JCheckBox getCb2SI() {
		return cb2SI;
	}

	public void setCb2SI(JCheckBox cb2si) {
		cb2SI = cb2si;
	}

	public JCheckBox getCb2NO() {
		return cb2NO;
	}

	public void setCb2NO(JCheckBox cb2no) {
		cb2NO = cb2no;
	}

	public JCheckBox getCb3SI() {
		return cb3SI;
	}

	public void setCb3SI(JCheckBox cb3si) {
		cb3SI = cb3si;
	}

	public JCheckBox getCb3NO() {
		return cb3NO;
	}

	public void setCb3NO(JCheckBox cb3no) {
		cb3NO = cb3no;
	}

	public JCheckBox getCb4SI() {
		return cb4SI;
	}

	public void setCb4SI(JCheckBox cb4si) {
		cb4SI = cb4si;
	}

	public JCheckBox getCb4NO() {
		return cb4NO;
	}

	public void setCb4NO(JCheckBox cb4no) {
		cb4NO = cb4no;
	}

	public JCheckBox getCb5SI() {
		return cb5SI;
	}

	public void setCb5SI(JCheckBox cb5si) {
		cb5SI = cb5si;
	}

	public JCheckBox getCb5NO() {
		return cb5NO;
	}

	public void setCb5NO(JCheckBox cb5no) {
		cb5NO = cb5no;
	}

	public JCheckBox getCb6SI() {
		return cb6SI;
	}

	public void setCb6SI(JCheckBox cb6si) {
		cb6SI = cb6si;
	}

	public JCheckBox getCb6NO() {
		return cb6NO;
	}

	public void setCb6NO(JCheckBox cb6no) {
		cb6NO = cb6no;
	}

	public JCheckBox getCb7SI() {
		return cb7SI;
	}

	public void setCb7SI(JCheckBox cb7si) {
		cb7SI = cb7si;
	}

	public JCheckBox getCb7NO() {
		return cb7NO;
	}

	public void setCb7NO(JCheckBox cb7no) {
		cb7NO = cb7no;
	}

	public JCheckBox getCb8SI() {
		return cb8SI;
	}

	public void setCb8SI(JCheckBox cb8si) {
		cb8SI = cb8si;
	}

	public JCheckBox getCb8NO() {
		return cb8NO;
	}

	public void setCb8NO(JCheckBox cb8no) {
		cb8NO = cb8no;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public void setBtnFinalizar(JButton btnFinalizar) {
		this.btnFinalizar = btnFinalizar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	

}