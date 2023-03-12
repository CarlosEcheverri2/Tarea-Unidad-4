
package ordenamiento;

import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Matriz = new javax.swing.JTextField();
        Burbuja = new javax.swing.JButton();
        Insercion = new javax.swing.JButton();
        shellSort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProcessArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Result = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Seleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizActionPerformed(evt);
            }
        });

        Burbuja.setText("Burbuja");
        Burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurbujaActionPerformed(evt);
            }
        });

        Insercion.setText("Inserción");
        Insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsercionActionPerformed(evt);
            }
        });

        shellSort.setText("Shellsort");
        shellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shellSortActionPerformed(evt);
            }
        });

        ProcessArea.setColumns(20);
        ProcessArea.setRows(5);
        jScrollPane1.setViewportView(ProcessArea);

        jLabel1.setText("Resultado");

        jLabel2.setText("2) Selecciona el metodo de ordenamiento");

        jLabel3.setText("1) Ingrese los valores separados por comas");

        Seleccion.setText("Seleccion");
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matriz)
                    .addComponent(jScrollPane1)
                    .addComponent(Result)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Burbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addComponent(Insercion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shellSort, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Burbuja)
                    .addComponent(Insercion)
                    .addComponent(shellSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Seleccion)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurbujaActionPerformed
        
        try {
            ProcessArea.setText("Ordenamiento por burbuja" + "\n" + "\n");
            String value = Matriz.getText();
            String [] values = value.split(",");
            int [] array = changeArrayStrongtoInt(values);
            
            int aux;
            boolean estado = false;
            int cont = 1;
            
            while(true){
                
                ProcessArea.append("Recorrido " + cont +"\n");
                
                estado = false;
                for(int i=1;i<array.length;i++){   
        
                    if(array[i] < array[i-1]){
                        // asignamos a la variable aux el valor de la posicion
                        aux = array[i];
                        // asignamos la variable que comparamos y la ponemos en la posición
                        array[i] = array[i-1];
                        // le asignamos el valor de la posicion correcta 
                        // con la variable aux que tiene el valor que comparamos
                        array[i-1] = aux;  
                        estado=true;
                        ProcessArea.append(" --> " + retornarArrayString(array));
                        
                    }
                    //ProcessArea.append("\n");
                }
                
                
                ProcessArea.append("\n" + retornarArrayString(array)+ "\n");
                cont ++;
                // validamos el estado si no se realiza el cambio y finalizamos con el breack 
                // finalizamos la ejecucion
                if(estado==false)break;
            }
            Result.setText(retornarArrayString(array));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos");
        }
        
    }//GEN-LAST:event_BurbujaActionPerformed

    private void MatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizActionPerformed
        
    }//GEN-LAST:event_MatrizActionPerformed

    private void InsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsercionActionPerformed
        
        try {
            ProcessArea.setText("Ordenamiento por insercion" + "\n");
            String value = Matriz.getText();
             String [] values = value.split(",");
             int [] array = changeArrayStrongtoInt(values);
             
            int n = array.length;
            for (int i = 1; i < n; ++i) {
                
                int key = array[i];
                
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
                
                ProcessArea.append("Recorrido " + i + "\n");
                ProcessArea.append(retornarArrayString(array)+ "\n");
            }
            
            Result.setText(retornarArrayString(array));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos");
        }     
    }//GEN-LAST:event_InsercionActionPerformed

    private void shellSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shellSortActionPerformed
        
        try {
            ProcessArea.setText("Ordenamiento por shellSort" + "\n");
            String value = Matriz.getText();
            String [] values = value.split(",");
            int [] array = changeArrayStrongtoInt(values);
            
            int n = array.length;
            for (int gap = n/2; gap > 0; gap /= 2) {
                
                for (int i = gap; i < n; i++) {
                    int temp = array[i];
                    int j;
                    for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                        array[j] = array[j - gap];
                    }
                    array[j] = temp;
                    ProcessArea.append(" --> " + retornarArrayString(array));
                }
            
            ProcessArea.append("\n Recorrido " + "\n");
            ProcessArea.append(retornarArrayString(array)+ "\n");
            
            }
            
            Result.setText(retornarArrayString(array));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos");
        }
        
        String value = Matriz.getText();
        String [] values = value.split(",");
        // TODO add your handling code here:
    }//GEN-LAST:event_shellSortActionPerformed

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
    
    try {
        ProcessArea.setText("Ordenamiento por Seleccion" + "\n");
        String value = Matriz.getText();
        String [] values = value.split(",");
        int [] array = changeArrayStrongtoInt(values);
        
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            ProcessArea.append("Recorrido " + i +"\n");
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            
            ProcessArea.append(retornarArrayString(array)+ "\n");
        }
        
        Result.setText(retornarArrayString(array));
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se han ingresado datos");
    }
        
    
            // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    public static void imprimirArray  (int []arreglo) {

        System.out.print("[");
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
            if(i  != (arreglo.length - 1)){
                System.out.print(",");
            }      
        }
        
        System.out.print("]"+"\n");
    }
    
        public static String retornarArrayString  (int []arreglo) {       
        StringBuilder arrayString = new StringBuilder("");
        arrayString.append("[");
        
        for(int i = 0; i < arreglo.length; i++){
            arrayString.append(arreglo[i]);
            if(i  != (arreglo.length - 1)){
                arrayString.append(",");
            }      
        }
        
        arrayString.append("]"+"\n");
        return arrayString.toString();
    }
    
    public static int[] changeArrayStrongtoInt (String [] arr) {
        int [] arrayInt = new int[arr.length];
        for(int i = 0; i < arr.length ; i++){
            arrayInt[i] = Integer.parseInt(arr[i]);
        }

        return arrayInt;
    }
     

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Burbuja;
    private javax.swing.JButton Insercion;
    private javax.swing.JTextField Matriz;
    private javax.swing.JTextArea ProcessArea;
    private javax.swing.JTextField Result;
    private javax.swing.JButton Seleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton shellSort;
    // End of variables declaration//GEN-END:variables
}
