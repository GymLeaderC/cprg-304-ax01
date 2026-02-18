<h1>Getting Started — Cloning the Repository in Eclipse</h1>

<h2>Prerequisites</h2>
Eclipse IDE installed on your machine
Make sure you have Git installed and available on your system PATH
You have access to the project repository (ensure you have been granted permissions)

<h2>Steps</h2>

<h3>1. Copy the GitHub Repository</h3>

Navigate to the repository on GitHub/GitLab/etc.
Click the green Code button and copy the HTTPS or SSH URL.

<h3>2. Open Eclipse and Launch the Import Wizard</h3>

Open Eclipse and select your desired workspace.
From the menu bar, go to File → Import.

<h3>3. Select the Git Import Option</h3>

In the Import dialog, expand the Git folder.
Select Projects from Git and click Next.

<h3>4. Choose "Clone URI"</h3>

Select Clone URI and click Next.

<h3>5. Enter the Repository Details</h3>

Paste the repository URL into the URI field. Eclipse will auto-populate the Host and Repository Path fields.
Enter your Git credentials (username and password/token) if prompted.
Click Next.

<h3>6. Select the Branch</h3>

Select the branch(es) you want to clone (typically main or develop).
Click Next.

<h3>7. Choose a Local Destination</h3>

Choose the local directory where the repository will be stored on your machine.
Click Next.

<h3>8. Import the Project into Eclipse</h3>

Select Import existing Eclipse projects and click Next.
Ensure your project is checked in the list and click Finish.

<h3>9. Verify the Setup</h3>

The project should now appear in your Package Explorer or Project Explorer panel.
Right-click the project and select Refresh if files do not appear immediately.


<h2>Troubleshooting</h2>

<h3>Git not recognized?</h3>

Ensure Git is installed and Eclipse is configured to find it under Window → Preferences → Team → Git → Configuration.

<h3>Authentication failed?</h3>

If your repository uses two-factor authentication, use a personal access token instead of your password. You can create this token by: 

→ Going to GitHub

→ Click on Profile Picture 

→ Settings 

→ Developer Settings @ the Bottom of Left Sidebar 

→ Personal Access Tokens on Left Sidebar 

→ Tokens (classic) 

→ Generate new Token 

→ Generate new Token (classic) 

→ Give the token a Note, Expiry, and Toggle Access to repo 

→ Click Generate token @ bottom of screen 

→ **COPY YOUR KEY IMMEDIATELY AS YOU WILL LOSE ACCESS TO IT THE MOMENT YOU LEAVE THE SCREEN**

<h3>Project not building?</h3>
Check that your JDK/JRE is properly configured under Window → Preferences → Java → Installed JREs.
