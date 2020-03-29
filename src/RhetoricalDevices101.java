/*
 * Name: Tianhui Yang
 * Date: 22 July 2019
 * Title: Rhetorical Devices 101 - Summative Assignment 
 */

public class RhetoricalDevices101 extends javax.swing.JFrame {

    public RhetoricalDevices101() {
        initComponents();
        
        //Intially disables all buttons except for the difficuly level (low or high) buttons
        btnDifficulty.setEnabled (true);
        btnFinishQuiz.setEnabled (true);
        btnRhetoricalDevice.setEnabled(false);
        btnNovel.setEnabled(false);
    }
    
    //Declare variables globally
    String  strDifficulty, strOutputLow, strOutputHigh, strExample, strExample1, strExample2;
    int intRhetDevice;

    @SuppressWarnings("unchecked")
    
    //Method for low difficulty setting
    public String LowDifficulty ()
    {
        intRhetDevice = Integer.parseInt(txtChoiceInput.getText()); //Stores rhetorical device choice as an integer 
        if (intRhetDevice == 1) //Definition for simile
        {
            strOutputLow = "A simile is the comparison of two things using the word \"like\" or \"as\".";
        }
        else if (intRhetDevice == 2) //Definition for an allusion
        {
            strOutputLow = "An allusion is the act of indirectly referring to an author, text, or idea that is outside of the given text.";
        }
        else if (intRhetDevice == 3) //Definition for imagery
        {
            strOutputLow = "Imagery is the description of a place.";
        }
        else if (intRhetDevice == 4) //Definition for metaphor
        {
            strOutputLow = "A metaphor is the comparison of two things without using the word \"like\" or \"as\".";
        }
        else if (intRhetDevice == 5) //Definition for personification
        {
            strOutputLow = "Personification is describing an object using human traits.";
        }
        else if (intRhetDevice == 6) //Definition for a hyperbole
        {
            strOutputLow = "A hyperbole is an exaggeration.";
        }
        else //Error message
        {
            lblError1.setText("Invalid input. Please enter a number between 1 and 6.");
        }
        return strOutputLow;
    }
    
    //Method for high difficulty setting
    public String HighDifficulty ()
    {
        intRhetDevice = Integer.parseInt(txtChoiceInput.getText()); //Stores rhetorical device choice as an integer 
        if (intRhetDevice == 1) //Definition of simile
        {
            strOutputHigh = "A simile is a figure of speech involving the comparison of one thing with another thing of a different kind, using \"like\" or \"as\".";
        }
        else if (intRhetDevice == 2) //Definition of an allusion
        {
            strOutputHigh = "An allusion is a brief and indirect reference to a person, place, thing or idea of historical, cultural, literary or political significance. The description/reference is usually vague.";
        }
        else if (intRhetDevice == 3) //Definition of imagery
        {
            strOutputHigh = "Imagery uses figurative language to represent objects, actions, and ideas in a manner that appeals to our physical senses.";
        }
        else if (intRhetDevice == 4) //Definition of a metaphor
        {
            strOutputHigh = "A metaphor is a figure of speech that makes an implicit, implied, or hidden comparison between two unrelated things, but which share some common characteristics.";
        }
        else if (intRhetDevice == 5) //Definition of personification
        {
            strOutputHigh = "Personification is a figure of speech in which a thing (an idea or an animal) is given human attributes.";
        }
        else if (intRhetDevice == 6) //Definition of a hyperbole
        {
            strOutputHigh = "A hyperbole is an unreal exaggeration to emphasize the real situation.";
        }
        else //Error message
        {
            lblError1.setText("Invalid input. Please enter a number between 1 and 6");
        }
        return strOutputHigh;  
    }
    
    //Method for displaying examples from (1) To Kill a Mockingbird
    public String Example1 ()
    {
        if (intRhetDevice == 1) //Simile
        {
            strExample1 = "Chapter 4: \"He was as good as his worst perfomance.\"";
        }
        else if (intRhetDevice == 2) //Allusion
        {
            strExample1 = "Chapter 1: \"Simon would have regarded with impotent fury the disturbance between the North and the South.\" \n\n\"Disturbance between the North and the South\" alludes to The Civil War.";
        }
        else if (intRhetDevice == 3) //Imagery
        {
            strExample1 = "Chapter 1: \"The Radley place jutted into a sharp curve beyond our house. Walking south, one faced its porch, the sidewalk turned and ran beside the lot.\"";
        }
        else if (intRhetDevice == 4) //Metaphor
        {
            strExample1 = "Chapter 3: \"You never really understand a person until you consider things from his point of view [...] until you climb into his skin and walk around in it.\"";
        }
        else if (intRhetDevice == 5) //Personification
        {
            strExample1 = "Chapter 9: \"Let's not let our imaginations run away with us.\"";
        }
        else if (intRhetDevice == 6) //Hyperbole
        {
            strExample1 = "Chapter 2: \"You’re starting off on the wrong foot in every way.\"";
        }
        else //Error message
        {
            lblError1.setText("Invalid input. Please enter a number between 1 and 6.");
        }
        return strExample1;
    }
    
    public String Example2 ()
    {
        if (intRhetDevice == 1) //Simile
        {
            strExample2 = "Act 1 Scene 3: \"He’s as tall a man as any’s in Illyria.\"";
        }
        else if (intRhetDevice == 2) //Allusion
        {
            strExample2 = "Act 1 Scene 4: \"Diana's lip \nIs not more smooth and rubious.\" \n\n\"Diana's lip\" alludes to Diana, the Roman goddess.";
        }
        else if (intRhetDevice == 3) //Imagery
        {
            strExample2 = "Act 2 Scene 5: \"In my branched velvet gown, having come from a daybed.\"";
        }
        else if (intRhetDevice == 4) //Metaphor
        {
            strExample2 = "Act 1 Scene 4: \"I have unclasped\nTo thee the book even of my secret soul.\"";
        }
        else if (intRhetDevice == 5) //Personification
        {
            strExample2 = "Act 2 Scene 1: \"She bore a mind that envy could not but call fair.\"";
        }
        else if (intRhetDevice == 6) //Hyperbole
        {
            strExample2 = "Act 3 Scene 2: \"And they have been grand-jurymen since before Noah was a sailor.\"";
        }
        else //Error message
        {
            lblError1.setText("Invalid input. Please enter a number between 1 and 6.");
        }
        return strExample2;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblRhetoricalDevice = new javax.swing.JLabel();
        txtChoiceInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExampleOutput = new javax.swing.JTextArea();
        txtExampleInput = new javax.swing.JTextField();
        lblNovels = new javax.swing.JLabel();
        lblNovelTitle = new javax.swing.JLabel();
        btnNovel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDefinitionOutput = new javax.swing.JTextArea();
        lblDifficulty = new javax.swing.JLabel();
        btnRhetoricalDevice = new javax.swing.JButton();
        btnFinishQuiz = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        btnDifficulty = new javax.swing.JButton();
        txtDifficultyInput = new javax.swing.JTextField();
        lblError2 = new javax.swing.JLabel();
        lblError3 = new javax.swing.JLabel();
        lblRhetoricalDevice1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        lblFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 255));
        lblTitle.setText("Rhetorical Devices 101");

        lbl1.setText("1. Simile");

        lbl2.setText("2. Allusion");

        lbl3.setText("3. Imagery");

        lbl4.setText("4. Metaphor");

        lbl5.setText("5. Personification");

        lbl6.setText("6. Hyperbole");

        lblRhetoricalDevice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRhetoricalDevice.setText("Please select the rhetorical device to learn");

        txtChoiceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChoiceInputActionPerformed(evt);
            }
        });

        txtExampleOutput.setEditable(false);
        txtExampleOutput.setColumns(20);
        txtExampleOutput.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtExampleOutput.setLineWrap(true);
        txtExampleOutput.setRows(5);
        txtExampleOutput.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtExampleOutput);

        txtExampleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExampleInputActionPerformed(evt);
            }
        });

        lblNovels.setText("1. To Kill a Mockingbird  2. Twelfth Night");

        lblNovelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNovelTitle.setText("Please select the novel");

        btnNovel.setText("Enter");
        btnNovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovelActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDefinitionOutput.setEditable(false);
        txtDefinitionOutput.setColumns(20);
        txtDefinitionOutput.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtDefinitionOutput.setLineWrap(true);
        txtDefinitionOutput.setRows(5);
        txtDefinitionOutput.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDefinitionOutput);

        lblDifficulty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDifficulty.setText("Please select the level of difficulty");

        btnRhetoricalDevice.setText("Enter");
        btnRhetoricalDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRhetoricalDeviceActionPerformed(evt);
            }
        });

        btnFinishQuiz.setForeground(new java.awt.Color(0, 0, 255));
        btnFinishQuiz.setText("Submit Quiz");
        btnFinishQuiz.setToolTipText("");
        btnFinishQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishQuizActionPerformed(evt);
            }
        });

        lblError1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblError1.setForeground(new java.awt.Color(255, 0, 0));

        lbl8.setText("1. Low              2. High");

        btnDifficulty.setText("Enter");
        btnDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDifficultyActionPerformed(evt);
            }
        });

        txtDifficultyInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDifficultyInputActionPerformed(evt);
            }
        });

        lblError2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblError2.setForeground(new java.awt.Color(255, 0, 0));

        lblError3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblError3.setForeground(new java.awt.Color(255, 0, 0));

        lblRhetoricalDevice1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRhetoricalDevice1.setForeground(new java.awt.Color(0, 0, 255));
        lblRhetoricalDevice1.setText("QUIZ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Please indicate which rhetorical device each statement is an example of.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("The number for each device is the same as the menu above (1. Simile 2. Allusion etc.)");

        jLabel4.setText("The sun smiled down on the children.");

        jLabel5.setText("Glittering white, the blanket of snow covered everything in sight.");

        jLabel6.setText("There lay a garden of Eden.");

        jLabel7.setText("She was as brave as a lion.");

        jLabel8.setText("Mother was reminded 1000 times. ");

        txt1.setToolTipText("");

        txt2.setToolTipText("");

        txt3.setToolTipText("");

        txt4.setToolTipText("");

        txt5.setToolTipText("");

        lblFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(255, 0, 0));
        lblFinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(lblRhetoricalDevice1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(427, 427, 427)
                                    .addComponent(btnFinishQuiz)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblTitle))
                            .addComponent(lblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblError1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDifficulty)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDifficultyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDifficulty))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1)
                                        .addComponent(lbl2))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl4)
                                        .addComponent(lbl3))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl5)
                                        .addComponent(lbl6)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblRhetoricalDevice)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                    .addComponent(txtChoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRhetoricalDevice))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblNovelTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNovels, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtExampleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNovel))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblError3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDifficultyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDifficulty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRhetoricalDevice)
                    .addComponent(txtChoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRhetoricalDevice))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl5)
                            .addComponent(lbl3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl6)
                            .addComponent(lbl4))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNovelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovels)
                    .addComponent(btnNovel)
                    .addComponent(txtExampleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblRhetoricalDevice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel4))
                                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinishQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtChoiceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChoiceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChoiceInputActionPerformed

    private void txtExampleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExampleInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExampleInputActionPerformed

    private void btnNovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovelActionPerformed
        //Clears text boxes and error messages
        lblError3.setText(null);
        lblError1.setText(null);
        
        int intExample = Integer.parseInt(txtExampleInput.getText()); //Gets user input for which text to recieve the example
        if (intExample == 1) //Examples from To Kill a Mockingbird
        {
            strExample = Example1 (); //Calls method for 1 
            txtExampleOutput.setText(strExample1);
        }
        else if (intExample == 2) //Examples from Twelfth Night 
        {
            strExample = Example2 (); //Calls method for 2
            txtExampleOutput.setText(strExample2);
        }
        else //Error message
        {
            lblError3.setText("Invalid input. Please enter either 1 or 2.");
        }
        
    }//GEN-LAST:event_btnNovelActionPerformed

    private void btnRhetoricalDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRhetoricalDeviceActionPerformed
        
        //Clears text boxes and error messages
        txtExampleOutput.setText(null);
        lblError1.setText(null);
        lblError3.setText(null);
        txtExampleInput.setText(null);
        
        int intDifficulty = Integer.parseInt(txtDifficultyInput.getText()); //Gets difficulty preference from user 
        if (intDifficulty == 1) //Low difficulty setting
        {
            strDifficulty = LowDifficulty(); //Calls low difficulty method
            txtDefinitionOutput.setText(strOutputLow);
        }
        else if (intDifficulty == 2) //High difficulty setting 
        {
            strDifficulty = HighDifficulty(); //Calls high difficulty method 
            txtDefinitionOutput.setText(strOutputHigh);
        }
        
    }//GEN-LAST:event_btnRhetoricalDeviceActionPerformed

    private void btnDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDifficultyActionPerformed
        
        //Clears texts and input boxes 
        lblError2.setText(null);
        txtDefinitionOutput.setText(null);
        txtExampleOutput.setText(null);
        txtChoiceInput.setText(null);
        txtExampleInput.setText(null);
        
        int intDifficulty = Integer.parseInt(txtDifficultyInput.getText()); //Get difficulty from user 
        if (intDifficulty == 1 || intDifficulty ==2) //If the user inputs a valid number (1 or 2)
        {
            //Other buttons are enabled after user inputs a valid difficulty setting
            btnDifficulty.setEnabled (true);
            btnRhetoricalDevice.setEnabled(true);
            btnNovel.setEnabled(true);
        }
        else //Error message 
        {
            lblError2.setText("Invalid Input. Please enter either 1 or 2");
        }
        
    }//GEN-LAST:event_btnDifficultyActionPerformed

    private void txtDifficultyInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDifficultyInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDifficultyInputActionPerformed

    private void btnFinishQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQuizActionPerformed
        //Declare and initialize arrays 
        int[] arrAnswers = {5,3,2,1,6}; //Array for answers 
        
        //Declare array objects based on user input
        int[] arrUserInput = new int[5]; //Five objects will be declared 
        arrUserInput[0] = Integer.parseInt(txt1.getText());
        arrUserInput[1] = Integer.parseInt(txt2.getText());
        arrUserInput[2] = Integer.parseInt(txt3.getText());
        arrUserInput[3] = Integer.parseInt(txt4.getText());
        arrUserInput[4] = Integer.parseInt(txt5.getText());
        
        int intMark = 0; //Initialize intMark as 0
        
        //Compares each answer at each index i
        for (int i = 0; i < arrAnswers.length; i++)
        {
            if ((arrUserInput[i] == arrAnswers[i]))
            {
                intMark++; //Add one mark to the user's total if an answer is correct 
            }
            else
            {
                intMark+=0; //Does not add a mark if the user is incorrect  
            }
        }
        lblFinal.setText ("You scored " + intMark + " out of 5."); //Displays the user's mark out of 5
    }//GEN-LAST:event_btnFinishQuizActionPerformed

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
            java.util.logging.Logger.getLogger(RhetoricalDevices101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RhetoricalDevices101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RhetoricalDevices101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RhetoricalDevices101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RhetoricalDevices101().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDifficulty;
    private javax.swing.JButton btnFinishQuiz;
    private javax.swing.JButton btnNovel;
    private javax.swing.JButton btnRhetoricalDevice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lblDifficulty;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblError3;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblNovelTitle;
    private javax.swing.JLabel lblNovels;
    private javax.swing.JLabel lblRhetoricalDevice;
    private javax.swing.JLabel lblRhetoricalDevice1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtChoiceInput;
    private javax.swing.JTextArea txtDefinitionOutput;
    private javax.swing.JTextField txtDifficultyInput;
    private javax.swing.JTextField txtExampleInput;
    private javax.swing.JTextArea txtExampleOutput;
    // End of variables declaration//GEN-END:variables
}
