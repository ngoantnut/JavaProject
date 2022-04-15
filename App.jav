package ManageStudentAWT;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class App implements ActionListener {
    public static ArrayList<Sinhvien> List=new ArrayList<>();

    
   
    Frame f;
    Panel panel;
    Label lbmssv,lbhoten,lbdiachi,lbgioitinh,lbquequan, lbemail,lbdiem1,lbdiem2,lbdiem3, lbtitle,lbtitle1;
    TextField textmssv,texthoten,textdiachi,textgioitinh,textquequan, textemail,textdiem1,textdiem2,textdiem3;
    Button btthem,btnucao,btsx,bthocbong, btxuat, btxoa, bthd;
    JTable table;
    JScrollPane js;
    DefaultTableModel model;
    Choice gioitinh;
    
    public App()
    {    
        f=new Frame();
        panel=new Panel();
        panel.setLayout(null);
        js = new JScrollPane();
        table = new JTable();
        f.setBackground(Color.LIGHT_GRAY);
        
        table.setAutoCreateRowSorter(true);// Sắp xếp luôn trong bảng
       
        btthem=new Button("Them");
        btnucao=new Button("Nu dat diem cao");
        btsx=new Button("Sap Xep");
        bthocbong=new Button("Xem DS Hoc Bong");
        btxuat=new Button("Xuat DS");
       
        bthd=new Button("Luu y nhap");
        
        bthd.setBounds(950,380,100,50);
        btthem.setBounds(50,380,100,50);
       
        btnucao.setBounds(500,380,100,50);
        btsx.setBounds(650,380,100,50);
        bthocbong.setBounds(800,380,100,50);
        btxuat.setBounds(350, 380, 100, 50);
        
     
        btthem.addActionListener(this);
        btxuat.addActionListener(this);
        btnucao.addActionListener(this);
        btsx.addActionListener(this);
        bthocbong.addActionListener(this);
        bthd.addActionListener(this);
        
        
        lbmssv=new Label("MSSV");
        textmssv=new TextField();
        lbmssv.setBounds(10, 10, 100, 20);
        textmssv.setBounds(130,10, 150, 20);
        
        lbhoten=new Label("Ho ten");
        texthoten=new TextField();
        lbhoten.setBounds(10, 50, 100, 20);
        texthoten.setBounds(130, 50, 150, 20);
        
        lbdiachi=new Label("Dia chi");
        textdiachi=new TextField();
        lbdiachi.setBounds(10, 90, 100, 20);
        textdiachi.setBounds(130,90, 150, 20);
        
        lbgioitinh=new Label("Gioi tinh");
        textgioitinh=new TextField();
        lbgioitinh.setBounds(10, 130, 100, 20);
        textgioitinh.setBounds(130, 130, 150, 20);
        
        lbquequan=new Label("Que quan");
        textquequan=new TextField();
        lbquequan.setBounds(10, 170, 100, 20);
        textquequan.setBounds(130, 170, 150, 20);
        
        lbemail=new Label("Email");
        textemail=new TextField();
        lbemail.setBounds(10, 210, 100, 20);
        textemail.setBounds(130,210, 150, 20);
        
        lbdiem1=new Label("Diem 1");
        textdiem1=new TextField();
        lbdiem1.setBounds(10, 250, 100, 20);
        textdiem1.setBounds(130,250, 150, 20);
        
        lbdiem2=new Label("Diem 2");
        textdiem2=new TextField();
        lbdiem2.setBounds(10, 290, 100, 20);
        textdiem2.setBounds(130,290, 150, 20);
        
        lbdiem3=new Label("Diem 3");
        textdiem3=new TextField();
        lbdiem3.setBounds(10,330, 100, 20);
        textdiem3.setBounds(130,330, 150, 20);
        
        js.setBounds(350,10, 800,340);
        js.setViewportView(table);
        
        panel.add(lbmssv);
        panel.add(textmssv);
        panel.add(lbhoten);
        panel.add(texthoten);
        panel.add(lbgioitinh);
        panel.add(textgioitinh);
        panel.add(lbdiachi);
        panel.add(textdiachi);
        panel.add(lbquequan);
        panel.add(textquequan);
        panel.add(lbemail);
        panel.add(textemail);
        panel.add(lbdiem1);
        panel.add(textdiem1);
        panel.add(lbdiem2);
        panel.add(textdiem2);
        panel.add(lbdiem3);
        panel.add(textdiem3);
        panel.add(btthem);
        panel.add(lbtitle);
        panel.add(lbtitle1);
        panel.add(btnucao);
        panel.add(btsx);
        panel.add(bthocbong);
        panel.add(btxuat);
        panel.add(bthd);
         f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        
        
        panel.add(js);
        
        f.add(panel);
        f.setSize(1200,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
         new App();
          
         }
    
    public void Them()
    {
        model=new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Họ tên");
        model.addColumn("Địa chỉ");
        model.addColumn("Giới tính");
        model.addColumn("Quê quán");
        model.addColumn("Email");
        model.addColumn("Diem 1");
        model.addColumn("Diem 2");
        model.addColumn("Diem 3");
        model.addColumn("Diem TB");
         
        if(KiemTra()==true){
        for(int i=0;i<List.size();i++)
        {  
            model.addRow(new Object[]{List.get(i).mssv,List.get(i).hoten,List.get(i).diachi,List.get(i).gioitinh,List.get(i).quequan,List.get(i).email,List.get(i).diem1,List.get(i).diem2,List.get(i).diem3, List.get(i).Diemtb()});
        }
        table.setModel(model);
    }
         
    }
    public boolean KiemTra()//Kiểm tra điều kiện dữ liệu
	{
		if(texthoten.getText().trim().compareTo("")==0||textmssv.getText().trim().compareTo("")==0)
		{
			JOptionPane.showMessageDialog(null,"Cẩn thận: Dữ liệu bạn nhập có vấn dề!");
			return false;
		}
		
		else return true;

	}
    
   
   
    public void Tinhdiemtb()
    {
        model=new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Ho ten");
        model.addColumn("Dia chi");
        model.addColumn("Gioi tinh");
        model.addColumn("Que quan");
        model.addColumn("Email");
        model.addColumn("Diem 1");
        model.addColumn("Diem 2");
        model.addColumn("Diem 3");
        model.addColumn("Diem TB");
        for(int i=0;i<List.size();i++)
        {
            model.addRow(new Object[]{List.get(i).mssv,List.get(i).hoten,List.get(i).diachi,List.get(i).gioitinh,List.get(i).quequan,List.get(i).email,List.get(i).diem1,List.get(i).diem2,List.get(i).diem3,List.get(i).Diemtb()});
        }
        table.setModel(model);
    }
    
    public void Sapxep()
    {
       JOptionPane.showMessageDialog(null,"Danh sách đã được sắp xếp \n Nhấp vào DiemTb trên bảng để sắp xếp kết quả");
    }
    
    public void Nucao()
    {
        
        model=new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Ho ten");
        model.addColumn("Dia chi");
        model.addColumn("Gioi tinh");
        model.addColumn("Que quan");
        model.addColumn("Email");
        model.addColumn("Diem 1");
        model.addColumn("Diem 2");
        model.addColumn("Diem 3");
        model.addColumn("Diem tb");
        for(int i=0;i<List.size();i++)
        {
            if(List.get(i).Diemtb()>7&&List.get(i).diem1>6)
            {
                if ("Nu".equals(List.get(i).gioitinh)) {
                   
                    model.addRow(new Object[]{List.get(i).mssv,List.get(i).hoten,List.get(i).diachi,List.get(i).gioitinh,List.get(i).quequan,List.get(i).email,List.get(i).diem1,List.get(i).diem2,List.get(i).diem3, List.get(i).Diemtb()});
                }
            } 
        }
        table.setModel(model);
    }
    public void Hocbong()
    {
        model=new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Ho ten");
        model.addColumn("Dia chi");
        model.addColumn("Gioi tinh");
        model.addColumn("Que quan");
        model.addColumn("Email");
        model.addColumn("Diem 1");
        model.addColumn("Diem 2");
        model.addColumn("Diem 3");
        model.addColumn("Diem tb");
        for(int i=0;i<List.size();i++)
        {
            if(List.get(i).Diemtb()>7&&List.get(i).diem1>=5&&List.get(i).diem2>=5&&List.get(i).diem3>=5)
            {
                model.addRow(new Object[]{List.get(i).mssv,List.get(i).hoten,List.get(i).diachi,List.get(i).gioitinh,List.get(i).quequan,List.get(i).email,List.get(i).diem1,List.get(i).diem2,List.get(i).diem3,List.get(i).Diemtb()});
            }
            
        }
        table.setModel(model);
    }
    public void xuat(){
        model=new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Ho ten");
        model.addColumn("Dia chi");
        model.addColumn("Gioi tinh");
        model.addColumn("Que quan");
        model.addColumn("Email");
        model.addColumn("Diem 1");
        model.addColumn("Diem 2");
        model.addColumn("Diem 3");
        model.addColumn("Diem tb");
        for(int i=0;i<List.size();i++)
        {
        model.addRow(new Object[]{List.get(i).mssv,List.get(i).hoten,List.get(i).diachi,List.get(i).gioitinh,List.get(i).quequan,List.get(i).email,List.get(i).diem1,List.get(i).diem2,List.get(i).diem3,List.get(i).Diemtb()});
        table.setModel(model);
    }}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btthem)
        {   
            
            List.add(new Sinhvien( textmssv.getText(), texthoten.getText(),textdiachi.getText(), textgioitinh.getText(),textquequan.getText(),textemail.getText(),Float.parseFloat(textdiem1.getText()),Float.parseFloat(textdiem2.getText()),Float.parseFloat(textdiem3.getText())));
            Them();
        }      
        if(e.getSource()==btnucao)
        {
            Nucao();

        }
        if(e.getSource()==btsx)
        {   JOptionPane.showMessageDialog(null,"Sắp xếp thành công!");
            Sapxep();
        }
        if(e.getSource()==bthocbong)
        {    JOptionPane.showMessageDialog(null,"Đã xuất danh sách học bổng");
            Hocbong();
        } 
        if(e.getSource()==btxuat)
        {   JOptionPane.showMessageDialog(null,"Xuất toàn bộ danh sách!");
            xuat();
        } 
        
        if(e.getSource()==bthd)
        {   JOptionPane.showMessageDialog(null,"Giới tính nhập: Nu");
            
        } 
    }
    
}
