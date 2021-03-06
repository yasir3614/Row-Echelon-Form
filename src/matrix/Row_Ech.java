/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static matrix.Matrix.REF;
import static matrix.Matrix.sendSteps;

/**
 *
 * @author Hp
 */
public class Row_Ech extends javax.swing.JFrame {

    /**
     * Creates new form Row_Ech
     */
    public Row_Ech() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_02 = new javax.swing.JTextField();
        m_01 = new javax.swing.JTextField();
        m_03 = new javax.swing.JTextField();
        m_06 = new javax.swing.JTextField();
        m_05 = new javax.swing.JTextField();
        m_04 = new javax.swing.JTextField();
        m_09 = new javax.swing.JTextField();
        m_08 = new javax.swing.JTextField();
        m_07 = new javax.swing.JTextField();
        submitMatrix = new javax.swing.JButton();
        label1 = new java.awt.Label();
        f02 = new javax.swing.JTextField();
        f01 = new javax.swing.JTextField();
        f03 = new javax.swing.JTextField();
        f05 = new javax.swing.JTextField();
        f07 = new javax.swing.JTextField();
        f04 = new javax.swing.JTextField();
        f06 = new javax.swing.JTextField();
        f08 = new javax.swing.JTextField();
        f09 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        steps_text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Row Echelon Form Calculator");
        setBackground(new java.awt.Color(153, 204, 255));

        m_02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        m_01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_01ActionPerformed(evt);
            }
        });

        m_03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        m_06.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_06ActionPerformed(evt);
            }
        });

        m_05.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_05.setToolTipText("");

        m_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        m_09.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_09ActionPerformed(evt);
            }
        });

        m_08.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_08ActionPerformed(evt);
            }
        });

        m_07.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m_07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_07ActionPerformed(evt);
            }
        });

        submitMatrix.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        submitMatrix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitMatrix.setText("Submit Matrix");
        submitMatrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitMatrixMousePressed(evt);
            }
        });
        submitMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitMatrixActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(153, 204, 255));
        label1.setFont(new java.awt.Font("Helvetica CE 55 Roman", 1, 30)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 51));
        label1.setText("Row Echelon Form Calculator");

        f02.setEditable(false);
        f02.setBackground(new java.awt.Color(255, 255, 204));
        f02.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f02.setForeground(java.awt.Color.red);
        f02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f02ActionPerformed(evt);
            }
        });

        f01.setEditable(false);
        f01.setBackground(new java.awt.Color(255, 255, 204));
        f01.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f01.setForeground(java.awt.Color.red);
        f01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f01ActionPerformed(evt);
            }
        });

        f03.setEditable(false);
        f03.setBackground(new java.awt.Color(255, 255, 204));
        f03.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f03.setForeground(java.awt.Color.red);
        f03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f03ActionPerformed(evt);
            }
        });

        f05.setEditable(false);
        f05.setBackground(new java.awt.Color(255, 255, 204));
        f05.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f05.setForeground(java.awt.Color.red);
        f05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f05ActionPerformed(evt);
            }
        });

        f07.setEditable(false);
        f07.setBackground(new java.awt.Color(255, 255, 204));
        f07.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f07.setForeground(java.awt.Color.red);
        f07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f07ActionPerformed(evt);
            }
        });

        f04.setEditable(false);
        f04.setBackground(new java.awt.Color(255, 255, 204));
        f04.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f04.setForeground(java.awt.Color.red);
        f04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f04ActionPerformed(evt);
            }
        });

        f06.setEditable(false);
        f06.setBackground(new java.awt.Color(255, 255, 204));
        f06.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f06.setForeground(java.awt.Color.red);
        f06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f06ActionPerformed(evt);
            }
        });

        f08.setEditable(false);
        f08.setBackground(new java.awt.Color(255, 255, 204));
        f08.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f08.setForeground(java.awt.Color.red);
        f08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f08ActionPerformed(evt);
            }
        });

        f09.setEditable(false);
        f09.setBackground(new java.awt.Color(255, 255, 204));
        f09.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        f09.setForeground(java.awt.Color.red);
        f09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f09ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(java.awt.SystemColor.info);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Instructions:\n1. Fill matrix in white matrix.\n2. Click \"Submit Matrix\"\n3. Result is in Yellow Matrix\n\nMade By:  \nMuhammad Yasir Javed (16k3614)\n");
        jScrollPane1.setViewportView(jTextArea1);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 153));
        jTextPane1.setText("R\nE\nS\nU\nL\nT");
        jScrollPane2.setViewportView(jTextPane1);

        steps_text.setColumns(20);
        steps_text.setRows(5);
        jScrollPane3.setViewportView(steps_text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(m_04, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(m_05, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(m_07, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(m_08, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m_06, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_09, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(submitMatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m_01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m_02, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m_03, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.99999_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f01, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f02, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f03, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(f07, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(f04, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f05, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(f08, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(f09, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(f06, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.99999_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.99999_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(m_02, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_03, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_01, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(m_04, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_05, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_06, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(m_09, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_08, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m_07, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(submitMatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(f03, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f02, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f01, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(f04, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f05, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(f06, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(f07, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f08, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(f09, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void m_09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_09ActionPerformed

    private void m_08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_08ActionPerformed

    private void m_07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_07ActionPerformed

    private void m_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_01ActionPerformed

    
    }//GEN-LAST:event_m_01ActionPerformed

    private void submitMatrixMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMatrixMousePressed
        double a11,a12,a13,a21,a22,a23,a31,a32,a33;
        String stepsHere = sendSteps();
        try{
            
        
           a11 = Double.parseDouble(
                this.m_01.getText());
         }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a00","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        try{
            a12 = Integer.parseInt(
                this.m_02.getText());
        }catch(Exception e){
            
             JOptionPane.showMessageDialog(this,"Bad/Invald Number at a01","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        try{
        a13 = Integer.parseInt(
                this.m_03.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a02","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        try{
        a21 = Integer.parseInt(
                this.m_04.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a10","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        try{
        a22 = Integer.parseInt(
                this.m_05.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a11","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        try{
        a23 = Integer.parseInt(
                this.m_06.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a12","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        try{
        a31 = Integer.parseInt(
                this.m_07.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a21","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        try{
        a32 = Integer.parseInt(
                this.m_08.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a22","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        try{
        a33 = Integer.parseInt(
                this.m_09.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Bad/Invald Number at a23","Error!",JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        double[][] matrix = {{a11,a12,a13},{a21,a22,a23},{a31,a32,a33}};
       REF(matrix,3,3);
//        DecimalFormat df2 = new DecimalFormat(".##");
//       for(int i=0;i<3;i++)
//           for(int j=0;j<3;j++)
//           {
//               matrix[i][j] = df2.format(matrix[i][j]);
//
//           }
       this.f01.setText(matrix[0][0]+"");
       this.f02.setText(matrix[0][1]+"");
       this.f03.setText(matrix[0][2]+"");
       this.f04.setText(matrix[1][0]+"");
       this.f05.setText(matrix[1][1]+"");
       this.f06.setText(matrix[1][2]+"");
       this.f07.setText(matrix[2][0]+"");
       this.f08.setText(matrix[2][1]+"");
       this.f09.setText(matrix[2][2]+"");
       
       this.steps_text.setText("yasir");
    }//GEN-LAST:event_submitMatrixMousePressed

    private void f02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f02ActionPerformed

    private void f01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f01ActionPerformed

    private void f03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f03ActionPerformed

    private void f05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f05ActionPerformed

    private void f07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f07ActionPerformed

    private void f04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f04ActionPerformed

    private void f06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f06ActionPerformed

    private void f08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f08ActionPerformed

    private void f09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f09ActionPerformed

    private void m_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_06ActionPerformed

    private void submitMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitMatrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitMatrixActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Row_Ech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Row_Ech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Row_Ech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Row_Ech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Row_Ech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField f01;
    public javax.swing.JTextField f02;
    public javax.swing.JTextField f03;
    public javax.swing.JTextField f04;
    public javax.swing.JTextField f05;
    public javax.swing.JTextField f06;
    public javax.swing.JTextField f07;
    public javax.swing.JTextField f08;
    public javax.swing.JTextField f09;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    public javax.swing.JTextField m_01;
    private javax.swing.JTextField m_02;
    private javax.swing.JTextField m_03;
    private javax.swing.JTextField m_04;
    private javax.swing.JTextField m_05;
    private javax.swing.JTextField m_06;
    private javax.swing.JTextField m_07;
    private javax.swing.JTextField m_08;
    private javax.swing.JTextField m_09;
    private javax.swing.JTextArea steps_text;
    public javax.swing.JButton submitMatrix;
    // End of variables declaration//GEN-END:variables
}
