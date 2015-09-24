import java.io.*;
import java.io.File;

public class TimeLogger 
{
    private BufferedWriter _writer;

    public TimeLogger(BufferedWriter writer)
    {
        _writer = writer;
    }

    public void log(long value)
    {
        this.log(String.valueOf(value));
    }

    public void log(String value)
    {
        try 
        {
            _writer.write(value);
            _writer.newLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }

    public void close()
    {
        try
        {
            _writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

