import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;

public class CampusMap extends Application {
    private List<Dorm> dorms = new ArrayList<>();
    private List<Person> studyGroup = new ArrayList<>();
    private Circle centerAll, centerGroup;
    private Text allLabel, groupLabel;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Image backgroundImg = new Image(getClass().getResource("/campus_background.webp").toExternalForm());
        ImageView background = new ImageView(backgroundImg);
        root.getChildren().add(background);

        // Sample dorms
        dorms.add(new Dorm("Adams", 150, 100, 50));
        dorms.add(new Dorm("Baker", 300, 250, 75));
        dorms.add(new Dorm("Clark", 500, 400, 30));

        // Sample study group
        studyGroup.add(new Person("Alex", dorms.get(0)));
        studyGroup.add(new Person("Jordan", dorms.get(1)));
        studyGroup.add(new Person("Taylor", dorms.get(2)));

        // Draw dorms
        for (Dorm d : dorms) {
            Circle dormCircle = new Circle(d.getX(), d.getY(), 15, Color.ORANGE);
            Text dormLabel = new Text(d.getX() + 20, d.getY(), d.getName() + " (" + d.getPopulation() + ")");
            root.getChildren().addAll(dormCircle, dormLabel);
        }

        // Center points
        centerAll = new Circle(10, Color.BLUE);
        centerGroup = new Circle(10, Color.GREEN);
        allLabel = new Text();
        groupLabel = new Text();
        root.getChildren().addAll(centerAll, centerGroup, allLabel, groupLabel);

        updateCenters();

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Campus Center Finder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateCenters() {
        double totalPop = 0, cxAll = 0, cyAll = 0;
        for (Dorm d : dorms) {
            totalPop += d.getPopulation();
            cxAll += d.getPopulation() * d.getX();
            cyAll += d.getPopulation() * d.getY();
        }
        cxAll /= totalPop;
        cyAll /= totalPop;

        double cxGroup = 0, cyGroup = 0;
        for (Person p : studyGroup) {
            cxGroup += p.getDorm().getX();
            cyGroup += p.getDorm().getY();
        }
        cxGroup /= studyGroup.size();
        cyGroup /= studyGroup.size();

        centerAll.setCenterX(cxAll);
        centerAll.setCenterY(cyAll);
        centerGroup.setCenterX(cxGroup);
        centerGroup.setCenterY(cyGroup);

        allLabel.setText("All Students Center: (" + (int)cxAll + ", " + (int)cyAll + ")");
        allLabel.setX(cxAll + 10);
        allLabel.setY(cyAll);
        groupLabel.setText("Study Group Center: (" + (int)cxGroup + ", " + (int)cyGroup + ")");
        groupLabel.setX(cxGroup + 10);
        groupLabel.setY(cyGroup);
    }

    public static void main(String[] args) {
        launch(args);
    }
}