package squaredmatrixfilter;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author Pablo
 * @author Christian
 */
public class SquaredMatrixFrame extends javax.swing.JFrame {

    private int[][] matrix;

    public SquaredMatrixFrame() {
        initComponents();
        boundATextField.setTransferHandler(null);
        boundBTextField.setTransferHandler(null);
        matrix = new int[10][10];
        randomizeMatrix(Integer.parseInt(boundATextField.getText()),
                Integer.parseInt(boundBTextField.getText()));
        displayMatrix(filterSlider.getValue());
        validationLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        matrixPanel = new javax.swing.JPanel();
        matrixScrollPane = new javax.swing.JScrollPane();
        matrixTextArea = new javax.swing.JTextArea();
        filtePanel = new javax.swing.JPanel();
        filterSlider = new javax.swing.JSlider();
        sliderValueTextField = new javax.swing.JTextField();
        minimumTextField = new javax.swing.JTextField();
        maximumTextField = new javax.swing.JTextField();
        maximumLabel = new javax.swing.JLabel();
        minimumLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        plusOneButton = new javax.swing.JButton();
        minusOneButton = new javax.swing.JButton();
        plusTenButton = new javax.swing.JButton();
        minusTenButton = new javax.swing.JButton();
        plusOneHundredButton = new javax.swing.JButton();
        minusOneHundredButton = new javax.swing.JButton();
        plusOneThousandButton = new javax.swing.JButton();
        minusOneThousandButton = new javax.swing.JButton();
        plusTenThousandButton = new javax.swing.JButton();
        minusTenThousandButton = new javax.swing.JButton();
        authorPanel = new javax.swing.JPanel();
        christianLabel = new javax.swing.JLabel();
        pabloLabel = new javax.swing.JLabel();
        parametersPanel = new javax.swing.JPanel();
        boundATextField = new javax.swing.JTextField();
        boundBTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ignoreFilterButton = new javax.swing.JButton();
        validationLabel = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matriz cuadrada con filtro (CGV POQ)");
        setResizable(false);

        matrixPanel.setPreferredSize(new java.awt.Dimension(330, 330));

        matrixTextArea.setEditable(false);
        matrixTextArea.setColumns(20);
        matrixTextArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        matrixTextArea.setRows(5);
        matrixTextArea.setText("-999.999  -999.999  -999.999  -999.999  -999.999  -999.999  -999.999  -999.999  -999.999  -999.999\n-999.999\n-999.999\n-999.999\n-999.999\n-999.999\t\t\tFILLER FOR SIZING PURPOUSES, NOT AVAILABLE TO THE USER\n-999.999\n-999.999\n-999.999\n-999.999");
        matrixScrollPane.setViewportView(matrixTextArea);

        javax.swing.GroupLayout matrixPanelLayout = new javax.swing.GroupLayout(matrixPanel);
        matrixPanel.setLayout(matrixPanelLayout);
        matrixPanelLayout.setHorizontalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matrixScrollPane)
                .addContainerGap())
        );
        matrixPanelLayout.setVerticalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matrixScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        filterSlider.setMaximum(1000);
        filterSlider.setValue(500);
        filterSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                filterSliderStateChanged(evt);
            }
        });

        sliderValueTextField.setEditable(false);
        sliderValueTextField.setText("500");

        minimumTextField.setEditable(false);
        minimumTextField.setText("0");

        maximumTextField.setEditable(false);
        maximumTextField.setText("1000");

        maximumLabel.setText("Máximo");

        minimumLabel.setText("Mínimo");

        valueLabel.setText("Valor actual");

        plusOneButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        plusOneButton.setText("+1");
        plusOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOneButtonActionPerformed(evt);
            }
        });

        minusOneButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        minusOneButton.setText("-1");
        minusOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusOneButtonActionPerformed(evt);
            }
        });

        plusTenButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        plusTenButton.setText("+10");
        plusTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusTenButtonActionPerformed(evt);
            }
        });

        minusTenButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        minusTenButton.setText("-10");
        minusTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTenButtonActionPerformed(evt);
            }
        });

        plusOneHundredButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        plusOneHundredButton.setText("+100");
        plusOneHundredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOneHundredButtonActionPerformed(evt);
            }
        });

        minusOneHundredButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        minusOneHundredButton.setText("-100");
        minusOneHundredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusOneHundredButtonActionPerformed(evt);
            }
        });

        plusOneThousandButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        plusOneThousandButton.setText("+1000");
        plusOneThousandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOneThousandButtonActionPerformed(evt);
            }
        });

        minusOneThousandButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        minusOneThousandButton.setText("-1000");
        minusOneThousandButton.setMaximumSize(new java.awt.Dimension(67, 23));
        minusOneThousandButton.setMinimumSize(new java.awt.Dimension(67, 23));
        minusOneThousandButton.setPreferredSize(new java.awt.Dimension(67, 23));
        minusOneThousandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusOneThousandButtonActionPerformed(evt);
            }
        });

        plusTenThousandButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        plusTenThousandButton.setText("+10000");
        plusTenThousandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusTenThousandButtonActionPerformed(evt);
            }
        });

        minusTenThousandButton.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        minusTenThousandButton.setText("-10000");
        minusTenThousandButton.setMaximumSize(new java.awt.Dimension(75, 23));
        minusTenThousandButton.setMinimumSize(new java.awt.Dimension(75, 23));
        minusTenThousandButton.setPreferredSize(new java.awt.Dimension(75, 23));
        minusTenThousandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTenThousandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(minusTenThousandButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minusOneThousandButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minusOneHundredButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minusTenButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minusOneButton)
                .addGap(18, 18, 18)
                .addComponent(plusOneButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plusTenButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plusOneHundredButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plusOneThousandButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plusTenThousandButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusOneButton)
                    .addComponent(minusTenButton)
                    .addComponent(plusOneButton)
                    .addComponent(plusOneHundredButton)
                    .addComponent(minusOneHundredButton)
                    .addComponent(plusTenButton)
                    .addComponent(plusOneThousandButton)
                    .addComponent(minusOneThousandButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusTenThousandButton)
                    .addComponent(minusTenThousandButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout filtePanelLayout = new javax.swing.GroupLayout(filtePanel);
        filtePanel.setLayout(filtePanelLayout);
        filtePanelLayout.setHorizontalGroup(
            filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(filtePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(310, 310, 310)
                .addGroup(filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumLabel))
                .addContainerGap())
            .addComponent(filterSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        filtePanelLayout.setVerticalGroup(
            filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimumLabel)
                    .addComponent(maximumLabel)
                    .addComponent(valueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(filterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        christianLabel.setText("Christian García Viguera");

        pabloLabel.setText("Pablo Ortigosa Quevedo");

        javax.swing.GroupLayout authorPanelLayout = new javax.swing.GroupLayout(authorPanel);
        authorPanel.setLayout(authorPanelLayout);
        authorPanelLayout.setHorizontalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(christianLabel)
            .addComponent(pabloLabel)
        );
        authorPanelLayout.setVerticalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorPanelLayout.createSequentialGroup()
                .addComponent(christianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pabloLabel))
        );

        parametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango"));
        parametersPanel.setToolTipText(""); // NOI18N

        boundATextField.setText("1000");
        boundATextField.setToolTipText("El rango de valores máximo es [-999999,999999]");
        boundATextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boundATextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boundATextFieldKeyTyped(evt);
            }
        });

        boundBTextField.setText("0");
        boundBTextField.setToolTipText("El rango de valores máximo es [-999999,999999]");
        boundBTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boundBTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boundBTextFieldKeyTyped(evt);
            }
        });

        jLabel1.setText("Límite A");
        jLabel1.setToolTipText("");

        jLabel2.setText("Límite B");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout parametersPanelLayout = new javax.swing.GroupLayout(parametersPanel);
        parametersPanel.setLayout(parametersPanelLayout);
        parametersPanelLayout.setHorizontalGroup(
            parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boundATextField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(boundBTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parametersPanelLayout.setVerticalGroup(
            parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boundATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(parametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boundBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        ignoreFilterButton.setText("Mostrar sin filtro");
        ignoreFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ignoreFilterButtonActionPerformed(evt);
            }
        });

        validationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        validationLabel.setForeground(new java.awt.Color(255, 0, 0));
        validationLabel.setText("Escriba números válidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matrixPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(parametersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(ignoreFilterButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(filtePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parametersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(authorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validationLabel))
                        .addGap(20, 20, 20)
                        .addComponent(ignoreFilterButton)))
                .addGap(29, 29, 29)
                .addComponent(filtePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(matrixPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filterSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_filterSliderStateChanged
        displayMatrix(filterSlider.getValue());
        sliderValueTextField.setText(customFormat("###,###", filterSlider.getValue()));
    }//GEN-LAST:event_filterSliderStateChanged

    private void boundATextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boundATextFieldKeyTyped
        keyCatcher(boundATextField, evt);
    }//GEN-LAST:event_boundATextFieldKeyTyped

    private void boundBTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boundBTextFieldKeyTyped
        keyCatcher(boundBTextField, evt);
    }//GEN-LAST:event_boundBTextFieldKeyTyped

    private void boundATextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boundATextFieldKeyReleased
        textFieldKeyReleased(evt, boundATextField, boundBTextField);
    }//GEN-LAST:event_boundATextFieldKeyReleased

    private void boundBTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boundBTextFieldKeyReleased
        textFieldKeyReleased(evt, boundBTextField, boundATextField);
    }//GEN-LAST:event_boundBTextFieldKeyReleased

    private void textFieldKeyReleased(java.awt.event.KeyEvent evt, javax.swing.JTextField textFieldA, javax.swing.JTextField textFieldB) {
        String textA = textFieldA.getText();
        String textB = textFieldB.getText();
        char key = evt.getKeyChar();

        if (Character.isDigit(evt.getKeyChar()) || key == '-' || key == KeyEvent.VK_BACK_SPACE || key == KeyEvent.VK_DELETE) {
            if (textFilter(textA) && textFilter(textB)) {
                validationLabel.setVisible(false);
                int parseA = Integer.parseInt(textA);
                int parseB = Integer.parseInt(textB);
                randomizeMatrix(parseB, parseA);
                displayMatrix(filterSlider.getValue());
                updateSlider();
            } else {
                validationLabel.setVisible(true);
            }
        }
    }

    private void plusOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOneButtonActionPerformed
        addValueToSlider(1);
    }//GEN-LAST:event_plusOneButtonActionPerformed

    private void plusTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTenButtonActionPerformed
        addValueToSlider(10);
    }//GEN-LAST:event_plusTenButtonActionPerformed

    private void plusOneHundredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOneHundredButtonActionPerformed
        addValueToSlider(100);
    }//GEN-LAST:event_plusOneHundredButtonActionPerformed

    private void minusOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusOneButtonActionPerformed
        addValueToSlider(-1);
    }//GEN-LAST:event_minusOneButtonActionPerformed

    private void minusTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTenButtonActionPerformed
        addValueToSlider(-10);
    }//GEN-LAST:event_minusTenButtonActionPerformed

    private void minusOneHundredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusOneHundredButtonActionPerformed
        addValueToSlider(-100);
    }//GEN-LAST:event_minusOneHundredButtonActionPerformed

    private void minusOneThousandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusOneThousandButtonActionPerformed
        addValueToSlider(-1000);
    }//GEN-LAST:event_minusOneThousandButtonActionPerformed

    private void plusOneThousandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOneThousandButtonActionPerformed
        addValueToSlider(1000);
    }//GEN-LAST:event_plusOneThousandButtonActionPerformed

    private void plusTenThousandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTenThousandButtonActionPerformed
        addValueToSlider(10000);
    }//GEN-LAST:event_plusTenThousandButtonActionPerformed

    private void minusTenThousandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTenThousandButtonActionPerformed
        addValueToSlider(-10000);
    }//GEN-LAST:event_minusTenThousandButtonActionPerformed

    private void ignoreFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ignoreFilterButtonActionPerformed
        displayMatrix();
    }//GEN-LAST:event_ignoreFilterButtonActionPerformed

    private void keyCatcher(javax.swing.JTextField textField, java.awt.event.KeyEvent evt) {
        char key = evt.getKeyChar();

        //Only digits and '-' sign
        if (!Character.isDigit(key) && key != '-') {
            evt.consume();
            return;
        }

        String text = textField.getText();
        int numberUnits;
        if (text.length() != 0 && text.charAt(0) == '-') {
            numberUnits = text.length() - 1;
        } else {
            numberUnits = text.length();
        }

        if (numberUnits == 6 && key != '-') {
            evt.consume();
            return;
        }
        
        if (numberUnits == 7){
            evt.consume();
            return;
        }
    }

    private void randomizeMatrix(int boundA, int boundB) {
        int upperBound = Math.max(boundA, boundB);
        int lowerBound = Math.min(boundA, boundB);
        int range = upperBound - lowerBound;
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ran.nextInt(range + 1) + lowerBound;
            }
        }
    }

    private void displayMatrix(int filter) {
        displayMatrix(filter, false);
    }

    private void displayMatrix() {
        displayMatrix(0, true);
    }

    private void displayMatrix(int filter, boolean ignoreFilter) {
        ignoreFilter = !ignoreFilter;
        int boundAInt = Integer.parseInt(boundATextField.getText());
        int boundBInt = Integer.parseInt(boundBTextField.getText());
        int aux = Math.max(Math.abs(boundAInt), Math.abs(boundBInt));
        //Calculates maximum blank units(\s) needed to achieve formatting
        int maxUnits = 0;

        do {
            aux = aux / 10;
            maxUnits++;
        } while (aux >= 1);
        if (maxUnits > 3) {
            maxUnits++;
        }
        if (boundAInt < 0 || boundBInt < 0) {
            maxUnits++;
        }
        String res = "";
        if (matrix.length == 0 || matrix[0].length == 0) {
            matrixTextArea.setText(res);
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                aux = Math.abs(matrix[i][j]);
                int units;
                if (ignoreFilter && filter >= matrix[i][j]) {
                    units = maxUnits - 1;
                } else {
                    //Calculates blank units(\s) needed to achieve correct formatting
                    int iter = 0;
                    do {
                        aux = aux / 10;
                        iter++;
                    } while (aux >= 1);
                    if (iter > 3) {
                        iter++;
                    }
                    if (matrix[i][j] < 0) {
                        iter++;
                    }
                    units = maxUnits - iter;
                }

                for (int k = 0; k < units; k++) {
                    res += ' ';
                }
                if (ignoreFilter && filter >= matrix[i][j]) {
                    res += '-';
                } else {
                    res += (customFormat("###,###", matrix[i][j]));;
                }
                res += "  ";
            }
            res = res.substring(0, res.length() - 1);
            res += '\n';
        }
        res = res.substring(0, res.length() - 1);
        matrixTextArea.setText(res);
        return;
    }

    private void updateSlider() {
        int oldValue = filterSlider.getValue();
        int oldUpperBound = filterSlider.getMaximum();
        int oldLowerBound = filterSlider.getMinimum();
        int oldRange = oldUpperBound - oldLowerBound;
        int upperBound = Math.max(Integer.parseInt(boundATextField.getText()),
                Integer.parseInt(boundBTextField.getText()));
        int lowerBound = Math.min(Integer.parseInt(boundATextField.getText()),
                Integer.parseInt(boundBTextField.getText()));
        int range = upperBound - lowerBound;
        filterSlider.setMaximum(upperBound);
        filterSlider.setMinimum(lowerBound);
        //We get the new value using the rule of three
        int value;
        if (oldRange != 0) {
            value = ((oldValue - oldLowerBound) * range / oldRange) + lowerBound;
        } else {
            value = lowerBound;
        }
        filterSlider.setValue(value);
        updateRangeTextFields();
    }

    private void updateRangeTextFields() {
        minimumTextField.setText(customFormat("###,###", filterSlider.getMinimum()));
        maximumTextField.setText(customFormat("###,###", filterSlider.getMaximum()));
    }

    private void addValueToSlider(int n) {
        if ((n > 0 && filterSlider.getValue() > filterSlider.getMaximum() - n)
                || (n < 0 && filterSlider.getValue() < filterSlider.getMinimum() - n)) {
            //Do nothing
        } else {
            filterSlider.setValue(n + filterSlider.getValue());
        }
    }

    private String customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }

    private boolean textFilter(String input) {
        Pattern pattern = Pattern.compile("[-]?[0-9]+");
        java.util.regex.Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SquaredMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SquaredMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SquaredMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SquaredMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SquaredMatrixFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel authorPanel;
    private javax.swing.JTextField boundATextField;
    private javax.swing.JTextField boundBTextField;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel christianLabel;
    private javax.swing.JPanel filtePanel;
    private javax.swing.JSlider filterSlider;
    private javax.swing.JButton ignoreFilterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel matrixPanel;
    private javax.swing.JScrollPane matrixScrollPane;
    private javax.swing.JTextArea matrixTextArea;
    private javax.swing.JLabel maximumLabel;
    private javax.swing.JTextField maximumTextField;
    private javax.swing.JLabel minimumLabel;
    private javax.swing.JTextField minimumTextField;
    private javax.swing.JButton minusOneButton;
    private javax.swing.JButton minusOneHundredButton;
    private javax.swing.JButton minusOneThousandButton;
    private javax.swing.JButton minusTenButton;
    private javax.swing.JButton minusTenThousandButton;
    private javax.swing.JLabel pabloLabel;
    private javax.swing.JPanel parametersPanel;
    private javax.swing.JButton plusOneButton;
    private javax.swing.JButton plusOneHundredButton;
    private javax.swing.JButton plusOneThousandButton;
    private javax.swing.JButton plusTenButton;
    private javax.swing.JButton plusTenThousandButton;
    private javax.swing.JTextField sliderValueTextField;
    private javax.swing.JLabel validationLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
