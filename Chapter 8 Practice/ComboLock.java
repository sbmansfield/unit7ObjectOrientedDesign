public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    
    // 0: nothing entered; 1: secret1 done; 2: secret2 done; 3: secret3 done and unlocked
    private int lockState;
    
    private int currentNumber;
    private boolean validSoFar;
    
    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        secret1 = secret1;
        secret2 = secret2;
        secret3 = secret3;
    }
    
    public void reset() 
    { 
        currentNumber = 0;
    }
    
    public void turnLeft( int ticks ) 
    {
        currentNumber = (currentNumber + ticks) % 40;
        if (lockState == 1)
        {
            if (currentNumber == secret2)
            {
                lockState = 2;
            }
        }
        else
        {
            validSoFar = false;
            }
    }
    
    public void turnRight( int ticks ) 
    {
        if (lockState == 0)
        {
            if (currentNumber == secret1)
            {
                lockState = 1;
            }
        }
        else if (lockState == 2)
        {
            if ( currentNumber == secret3)
            {
                lockState = 3;
            }
        }
        else
        {
            validSoFar = false;
        }
    }
    
    public boolean open() 
    {
    
    }
    
}