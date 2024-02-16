package Tables;
public class Table
{
    protected int width, height;

    public Table(int tableWidth, int tableHeight)
    {
        width = tableWidth;
        height = tableHeight;
    }

    public final void ShowData()
    {
        System.out.printf("Width: %1$s, Height: %2$s" + "\r\n", width, height);
    }

    public final void Save(String name)
    {
        BinaryWriter outputFile = new BinaryWriter(File.Open(name, FileMode.Create));
        outputFile.Write(height);
        outputFile.Write(width);
        outputFile.Close();
    }

    public final void Load(String name)
    {
        BinaryReader inputFile = new BinaryReader(File.Open(name, FileMode.Open));
        height = inputFile.ReadInt32();
        width = inputFile.ReadInt32();
        inputFile.Close();
    }
}

package Tables;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Table[] tableList = new Table[10];
        Random random = new Random();

        for (int i = 0; i < tableList.length - 1; i++)
        {
            tableList[i] = new Table(random.nextInt(50, 201), random.nextInt(50, 201));
        }
        tableList[0].Save("1.dat");
        tableList[9] = new Table(0, 0);
        tableList[9].Load("1.dat");

        for (int i = 0; i < tableList.length; i++)
        {
            tableList[i].ShowData();
        }

        new Scanner(System.in).nextLine();
    }
}