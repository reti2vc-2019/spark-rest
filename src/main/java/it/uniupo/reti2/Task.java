package it.uniupo.reti2;

/**
 * Describe a Task with its properties.
 * @author <a href="mailto:luigi.derussis@uniupo.it">Luigi De Russis</a>
 * @version 1.2 (04/04/2019)
 */
public class Task {

    // the unique id of the task
    private int id;
    // the task content
    private String description;
    // whether the task is urgent or not
    private int urgent;


    /**
     * Task main constructor.
     *
     * @param id represents the task unique identifier
     * @param description the task content
     * @param urgent whether the task is urgent (1) or not (0)
     */
    public Task(int id, String description, int urgent) {
        this.id = id;
        this.description = description;
        this.urgent = urgent;
    }


    /**
     * Overloaded constructor. It create a task without a given id.
     *
     * @param description the task content
     * @param urgent whether the task is urgent (1) or not (0)
     */
    public Task(String description, int urgent) {
        this.id = 0;
        this.description = description;
        this.urgent = urgent;
    }


    /*** Getters **/

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getUrgent() {
        return urgent;
    }

}
