/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        setVisible(true);
        setResizable(false);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jButton0 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jButtonChangeSign = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonSubtract = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonReverse = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMemRestore = new javax.swing.JButton();
        jButtonMemAdd = new javax.swing.JButton();
        jButtonSqrt = new javax.swing.JButton();
        jButtonMemStore = new javax.swing.JButton();
        jButtonAllClear = new javax.swing.JButton();
        jButtonMemSubtract = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonPercent = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMemClear = new javax.swing.JButton();
        jTextFieldDisplayer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEqual.setText("=");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });

        jButtonChangeSign.setText("+/-");
        jButtonChangeSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeSignActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonSubtract.setText("-");
        jButtonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtractActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonMultiplication.setText("x");
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jButtonReverse.setText("1/x");
        jButtonReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReverseActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMemRestore.setText("MR");
        jButtonMemRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemRestoreActionPerformed(evt);
            }
        });

        jButtonMemAdd.setText("M+");
        jButtonMemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemAddActionPerformed(evt);
            }
        });

        jButtonSqrt.setText("√");
        jButtonSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSqrtActionPerformed(evt);
            }
        });

        jButtonMemStore.setText("MS");
        jButtonMemStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemStoreActionPerformed(evt);
            }
        });

        jButtonAllClear.setText("AC");
        jButtonAllClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllClearActionPerformed(evt);
            }
        });

        jButtonMemSubtract.setText("M-");
        jButtonMemSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemSubtractActionPerformed(evt);
            }
        });

        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        jButtonPercent.setText("%");
        jButtonPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonMemClear.setText("MC");
        jButtonMemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemClearActionPerformed(evt);
            }
        });

        jTextFieldDisplayer.setEditable(false);
        jTextFieldDisplayer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextFieldDisplayer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDisplayer.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDisplayer)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonMemClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMemRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMemStore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMemAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMemSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonSqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonReverse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonChangeSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTextFieldDisplayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMemClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMemRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMemStore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMemAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMemSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReverse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonChangeSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private BigDecimal firstNumber, secondNumber;//to calculate
    private BigDecimal memory = new BigDecimal("0");//for memory processing
    private boolean reset;//after pressing operator, sqrt, etc, display need to be reset
    private boolean doneCalculating;
    private boolean preventNextPress;
    int operator = 0;//+-x/ are 1234 respectively
    MathContext mc = new MathContext(8);

    private void checkIfNeedReset() {
        //check to continue adding char or reset the displayer
        if (reset || doneCalculating) {
            jTextFieldDisplayer.setText("0");
        }
        reset = false;
        doneCalculating = false;
        preventNextPress = false;
    }

    private void setOperator(int operator) {
        reset = true;
        this.operator = operator;
    }

    private BigDecimal getValue() {
        String value = jTextFieldDisplayer.getText();
        BigDecimal tempValue;
        try {
            tempValue = new BigDecimal(value);
        } catch (Exception e) {
            return firstNumber;
        }
        return tempValue;
    }

    private void calculate() {
        if (!doneCalculating) {
            if (operator == 0) {
                firstNumber = getValue();
            } else {
                secondNumber = getValue();
//                switchOP(operator);
                switch (operator) {
                    case 1:
                        firstNumber = firstNumber.add(secondNumber, mc);
                        break;
                    case 2:
                        firstNumber = firstNumber.subtract(secondNumber, mc);
                        break;
                    case 3:
                        firstNumber = firstNumber.multiply(secondNumber, mc);
                        break;
                    case 4:
                        if (secondNumber.equals(BigDecimal.ZERO)) {
                            JOptionPane.showMessageDialog(null, "Error!");
                            doneCalculating = false;
                            reset = true;
                            return;
                        } else {
                            firstNumber = firstNumber.divide(secondNumber, mc);
                        }
                        break;
                }
            }
            jTextFieldDisplayer.setText(firstNumber.multiply(BigDecimal.ONE, mc).toString());
            doneCalculating = true;
        }
    }

    private void pressNumber(String number) {
        //numbers pressed
        checkIfNeedReset();
        jTextFieldDisplayer.setText((new BigDecimal(jTextFieldDisplayer.getText() + number)).toString());//leading 0s cases can be ignored as bigdecimal 0 + 0 is 0 not 00
    }

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // Number 0 pressed
        pressNumber("0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Number 1 pressed
        pressNumber("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pressNumber("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pressNumber("3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pressNumber("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pressNumber("5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pressNumber("6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pressNumber("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pressNumber("8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        pressNumber("9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        // button dot (decimal) pressed
        checkIfNeedReset();
        String displaying = jTextFieldDisplayer.getText();
        if (!displaying.contains(".")) {//if there is a dot, do nothing
            jTextFieldDisplayer.setText(displaying + ".");
        }
    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButtonChangeSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeSignActionPerformed
        // +/- button pressed
        String text = jTextFieldDisplayer.getText();
        if (text.charAt(0) == '-') {
            jTextFieldDisplayer.setText(text.substring(1));
        } else {
            jTextFieldDisplayer.setText("-" + text);
        }
    }//GEN-LAST:event_jButtonChangeSignActionPerformed

    private void jButtonReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReverseActionPerformed
        // 1/x button pressed
        BigDecimal displaying = new BigDecimal(jTextFieldDisplayer.getText());
        if (!displaying.equals(BigDecimal.ZERO)) {
            BigDecimal result = BigDecimal.ONE.divide(displaying, mc);
            jTextFieldDisplayer.setText(result.toString());
            doneCalculating = true;
        } else {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        reset = true;
    }//GEN-LAST:event_jButtonReverseActionPerformed

    private void jButtonPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentActionPerformed
        // TODO add your handling code here:
        BigDecimal displaying = new BigDecimal(jTextFieldDisplayer.getText());
        BigDecimal result = displaying.divide(new BigDecimal("100"), mc);
        jTextFieldDisplayer.setText(result.toString());
        doneCalculating = true;
        reset = true;
    }//GEN-LAST:event_jButtonPercentActionPerformed

    private void jButtonSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSqrtActionPerformed
        // TODO add your handling code here:
        BigDecimal displaying = new BigDecimal(jTextFieldDisplayer.getText());
        if (displaying.compareTo(BigDecimal.ZERO) != -1) {
            double result = Math.sqrt(displaying.doubleValue());
            jTextFieldDisplayer.setText(String.format("%8f", result));
            doneCalculating = true;
        } else {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        reset = true;
    }//GEN-LAST:event_jButtonSqrtActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        calculate();
        setOperator(1);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtractActionPerformed
        // TODO add your handling code here:
        calculate();
        setOperator(2);
    }//GEN-LAST:event_jButtonSubtractActionPerformed

    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicationActionPerformed
        // TODO add your handling code here:
        calculate();
        setOperator(3);
    }//GEN-LAST:event_jButtonMultiplicationActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        // TODO add your handling code here:
        calculate();
        setOperator(4);
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonMemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemClearActionPerformed
        // MC pressed
        memory = BigDecimal.ZERO;
        preventNextPress = true;
    }//GEN-LAST:event_jButtonMemClearActionPerformed

    private void jButtonMemRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemRestoreActionPerformed
        // MR pressed
        jTextFieldDisplayer.setText(memory.toString());
        reset = true;
        preventNextPress = true;
    }//GEN-LAST:event_jButtonMemRestoreActionPerformed

    private void jButtonMemStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemStoreActionPerformed
        // TODO add your handling code here:
        memory = new BigDecimal(jTextFieldDisplayer.getText());
        reset = true;
        preventNextPress = true;
    }//GEN-LAST:event_jButtonMemStoreActionPerformed

    private void jButtonMemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemAddActionPerformed
        // M+ pressed
        if (!preventNextPress) {
            memory = memory.add(getValue(), mc);
            preventNextPress = true;
            reset = true;
        }
    }//GEN-LAST:event_jButtonMemAddActionPerformed

    private void jButtonMemSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemSubtractActionPerformed
        // M-
        if (!preventNextPress) {
            memory = memory.subtract(getValue(), mc);
            preventNextPress = true;
            reset = true;
        }
    }//GEN-LAST:event_jButtonMemSubtractActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // C pressed
        if (!doneCalculating && !preventNextPress) {
            String displaying = jTextFieldDisplayer.getText();
            if (!displaying.equals("0")) {
                if (displaying.length() > 1) {
                    switch (displaying.charAt(displaying.length() - 2)) {
                        case '.':
                            displaying = displaying.substring(0, displaying.length() - 2);
                            jTextFieldDisplayer.setText(displaying);
                            break;
                        case '-':
                            jTextFieldDisplayer.setText("0");
                            break;
                        default:
                            displaying = displaying.substring(0, displaying.length() - 1);
                            jTextFieldDisplayer.setText(displaying);
                            break;
                    }
                } else {
                    jTextFieldDisplayer.setText("0");
                }

            }
        }
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAllClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllClearActionPerformed
        // AC pressed
        jTextFieldDisplayer.setText("0");
        firstNumber = new BigDecimal(BigInteger.ZERO);
        secondNumber = new BigDecimal(BigInteger.ZERO);
//        memory = new BigDecimal(BigInteger.ZERO);
    }//GEN-LAST:event_jButtonAllClearActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        // TODO add your handling code here:
        calculate();
        setOperator(0);
    }//GEN-LAST:event_jButtonEqualActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAllClear;
    private javax.swing.JButton jButtonChangeSign;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonMemAdd;
    private javax.swing.JButton jButtonMemClear;
    private javax.swing.JButton jButtonMemRestore;
    private javax.swing.JButton jButtonMemStore;
    private javax.swing.JButton jButtonMemSubtract;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonReverse;
    private javax.swing.JButton jButtonSqrt;
    private javax.swing.JButton jButtonSubtract;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldDisplayer;
    // End of variables declaration//GEN-END:variables
}
