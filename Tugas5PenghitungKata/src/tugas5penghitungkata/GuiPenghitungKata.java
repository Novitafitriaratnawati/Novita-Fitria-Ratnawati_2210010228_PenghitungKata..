/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas5penghitungkata;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.regex.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class GuiPenghitungKata extends javax.swing.JFrame {
    private static final Color PINK_BACKGROUND = new Color(255, 192, 203);
    private static final Color DARK_PINK = new Color(219, 112, 147);
    private static final Color LIGHT_PINK = new Color(255, 228, 225);
    private static final Color PURPLE = new Color(128, 0, 128);
    private static final Color LIGHT_PURPLE = new Color(216, 191, 216); 
    private static final Color BLUE_BACKGROUND = new Color(173, 216, 230); 
    
    public GuiPenghitungKata() {
        initComponents();
        customizeComponents();
        addListeners();
        
          setSize(550, 550); 
          setLocationRelativeTo(null);  // Posisi di tengah layar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cari:");

        jButton1.setText("Cari Kata");

        jLabel2.setText("Hasil Pencarian:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("Jumlah Kata:");

        jLabel4.setText("Jumlah Kalimat:");

        jLabel5.setText("Jumlah Karakter:");

        jLabel6.setText("Jumlah Paragraf:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton2.setText("Hitung");

        jButton3.setText("Simpan");

        jButton4.setText("Bersihkan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void customizeComponents() {
        // Set background colors
        getContentPane().setBackground(BLUE_BACKGROUND);
        jPanel1.setBackground(LIGHT_PURPLE);
        jPanel2.setBackground(LIGHT_PURPLE);
        
        // Style borders
        jPanel1.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(DARK_PINK, 2),
            "Masukkan Teks",
            javax.swing.border.TitledBorder.LEFT,
            javax.swing.border.TitledBorder.TOP
        ));
        
        jPanel2.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(DARK_PINK, 2),
            "Statistik",
            javax.swing.border.TitledBorder.LEFT,
            javax.swing.border.TitledBorder.TOP
        ));
        
        // Style buttons
        styleButton(jButton1); // Cari Kata
        styleButton(jButton2); // Hitung
        styleButton(jButton3); // Simpan
        styleButton(jButton4); // Bersihkan
        
        // Configure text area
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
    }
    
    private void styleButton(JButton button) {
        button.setBackground(LIGHT_PINK);
        button.setForeground(Color.BLACK);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(DARK_PINK, 2),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(DARK_PINK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(LIGHT_PINK);
            }
        });
    }
    
    private void addListeners() {
        // Cari button listener
        jButton1.addActionListener(evt -> searchText());
        
        // Hitung button listener
        jButton2.addActionListener(evt -> updateCounts());
        
        // Simpan button listener
        jButton3.addActionListener(evt -> saveToFile());
        
        // Bersihkan button listener
        jButton4.addActionListener(evt -> {
            jTextArea1.setText("");
            jTextField1.setText("");
            jLabel2.setText("Hasil Pencarian:");
            updateCounts();
        });
        
        jTextArea1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { updateCounts(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { updateCounts(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { updateCounts(); }
        });
    }
    
    private void updateCounts() {
        String text = jTextArea1.getText();
        
        // jumlah kata
        String[] words = text.trim().split("\\s+");
        int wordCount = text.trim().isEmpty() ? 0 : words.length;
        
        // Karakter
        int charCount = text.length();
        
        // Kalimat
        Pattern sentencePattern = Pattern.compile("[.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(text);
        int sentenceCount = 0;
        while (sentenceMatcher.find()) sentenceCount++;
        
        // paragraf
        String[] paragraphs = text.split("\n\\s*\n");
        int paragraphCount = text.trim().isEmpty() ? 0 : paragraphs.length;
        
        // Update labels
        jLabel3.setText("Jumlah Kata: " + wordCount);
        jLabel5.setText("Jumlah Karakter: " + charCount);
        jLabel4.setText("Jumlah Kalimat: " + sentenceCount);
        jLabel6.setText("Jumlah Paragraf: " + paragraphCount);
    }
    
       private void searchText() {
        String searchTerm = jTextField1.getText().toLowerCase().trim();
        String text = jTextArea1.getText().toLowerCase();

        if (searchTerm.isEmpty()) {
            jLabel2.setText("Hasil Pencarian: Masukkan kata yang ingin dicari");
            return;
        }

        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(searchTerm) + "\\b");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        jLabel2.setText("Hasil Pencarian: " + count + " kata ditemukan");

        // Menyoroti kata yang ditemukan dalam JTextArea
        javax.swing.text.Highlighter highlighter = jTextArea1.getHighlighter();
        highlighter.removeAllHighlights();

        try {
            javax.swing.text.DefaultHighlighter.DefaultHighlightPainter painter =
                    new javax.swing.text.DefaultHighlighter.DefaultHighlightPainter(new Color(255, 255, 0, 128));

            matcher = pattern.matcher(text);
            while (matcher.find()) {
                highlighter.addHighlight(matcher.start(), matcher.end(), painter);
            }
        } catch (javax.swing.text.BadLocationException e) {
            e.printStackTrace();
        }
    }



    private void saveToFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }
            
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("=== Hasil Analisis Teks ===");
                writer.println();
                writer.println("Teks:");
                writer.println(jTextArea1.getText());
                writer.println();
                writer.println("Statistik:");
                writer.println(jLabel3.getText());
                writer.println(jLabel5.getText());
                writer.println(jLabel4.getText());
                writer.println(jLabel6.getText());
                
                JOptionPane.showMessageDialog(this,
                    "File berhasil disimpan!",
                    "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                    "Error menyimpan file: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new GuiPenghitungKata().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
