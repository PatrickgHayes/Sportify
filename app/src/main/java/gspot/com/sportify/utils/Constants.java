package gspot.com.sportify.utils;

import gspot.com.sportify.BuildConfig;

/**
 * Created by patrickhayes on 4/20/16.
 * Constants class store most important strings and paths of the app
 */

public class Constants {

    /*Constants for FireBase */


    public static final String PASSWORD_PROVIDER = "password";
    public static final String FIREBASE_PROPERTY_EMAIL = "email";
    public static final String FIREBASE_LOCATION_PROFILES = "profiles";
    public static final String FIREBASE_LOCATION_USERS = "users";
    public static final String FIREBASE_LOCATION_USER_LISTS = "userLists";
    public static final String FIREBASE_LOCATION_USER_FRIENDS = "userFriends";
    public static final String FIREBASE_LOCATION_USER_GATHERINGS = "Events";
    public static final String FIREBASE_LOCATION_MY_GATHERINGS = "MyGatherings";

    public static final String FIREBASE_URL = BuildConfig.UNIQUE_FIREBASE_ROOT_URL;
    public static final String FIREBASE_URL_PROFILES = FIREBASE_URL + "/" + FIREBASE_LOCATION_PROFILES;
    public static final String FIREBASE_URL_GATHERINGS = FIREBASE_URL + "/" + FIREBASE_LOCATION_USER_GATHERINGS;
    public static final String FIREBASE_URL_MY_GATHERINGS = FIREBASE_URL + "/" + FIREBASE_LOCATION_MY_GATHERINGS;

    /*Constants for shared preferences */
    public static final String KEY_UID = "key_uid";
    public static final String STARTER_ID = "started";

    /*Constants for profiles */
    public static final int NUM_TIMES_OF_DAY = 4;
    public static final int NUM_DAYS_OF_WEEK = 7;
    public static final int TAG_CODE = 10;

    /*Constants for Profile Pictures */
    // this is the action code we use in our intent,
    // this way we know we're looking at the response from our own action
    public static final int SELECT_SINGLE_PICTURE = 101;
    // Need this to indicate what data type we are looking for when we pass
    // the intent
    public static final String IMAGE_TYPE = "image/*";

    /* Constant for default profile pic in base 64 */
    public static final String DEFAULT_PROFILE_PIC = "/9j/4QBmRXhpZgAATU0AKgAAAAgAAgExAAIAAAAMAAAAJodpAAQAAAABAAAANAAAAABwbGFzcSBza2l0Y2gAAAADkAAABwAAAAQwMjEwoAIABAAAAAEAAAD3oAMABAAAAAEAAAD3AAAAAP/gABBKRklGAAEBAAABAAEAAP/iGMRJQ0NfUFJPRklMRQABAQAAGLRhcHBsAhAAAG1udHJSR0IgWFlaIAfbAAEABgAPAAEAEWFjc3BBUFBMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD21gABAAAAANMtYXBwbAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEWRlc2MAAAFQAAAAYmRzY20AAAG0AAABDGNwcnQAAALAAAAA0Hd0cHQAAAOQAAAAFHJYWVoAAAOkAAAAFGdYWVoAAAO4AAAAFGJYWVoAAAPMAAAAFHJUUkMAAAPgAAAIDGFhcmcAAAvsAAAAIHZjZ3QAAAwMAAAGEm5kaW4AABIgAAAGPmNoYWQAABhgAAAALG1tb2QAABiMAAAAKGJUUkMAAAPgAAAIDGdUUkMAAAPgAAAIDGFhYmcAAAvsAAAAIGFhZ2cAAAvsAAAAIGRlc2MAAAAAAAAACERpc3BsYXkAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABtbHVjAAAAAAAAABIAAAAMbmxOTAAAACQAAADoZGFESwAAACQAAADocGxQTAAAACQAAADoZW5VUwAAACQAAADobmJOTwAAACQAAADoZnJGUgAAACQAAADocHRCUgAAACQAAADocHRQVAAAACQAAADoemhDTgAAACQAAADoZXNFUwAAACQAAADoamFKUAAAACQAAADocnVSVQAAACQAAADoc3ZTRQAAACQAAADoemhUVwAAACQAAADoZGVERQAAACQAAADoZmlGSQAAACQAAADoaXRJVAAAACQAAADoa29LUgAAACQAAADoAEwARQBEACAAQwBpAG4AZQBtAGEAIABEAGkAcwBwAGwAYQB5dGV4dAAAAABDb3B5cmlnaHQgQXBwbGUsIEluYy4sIDIwMTEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFhZWiAAAAAAAADzUgABAAAAARbPWFlaIAAAAAAAAHO8AAA7JAAAAd9YWVogAAAAAAAAXqoAALfXAAAUtVhZWiAAAAAAAAAkbwAADQUAALyZY3VydgAAAAAAAAQAAAAABQAKAA8AFAAZAB4AIwAoAC0AMgA2ADsAQABFAEoATwBUAFkAXgBjAGgAbQByAHcAfACBAIYAiwCQAJUAmgCfAKMAqACtALIAtwC8AMEAxgDLANAA1QDbAOAA5QDrAPAA9gD7AQEBBwENARMBGQEfASUBKwEyATgBPgFFAUwBUgFZAWABZwFuAXUBfAGDAYsBkgGaAaEBqQGxAbkBwQHJAdEB2QHhAekB8gH6AgMCDAIUAh0CJgIvAjgCQQJLAlQCXQJnAnECegKEAo4CmAKiAqwCtgLBAssC1QLgAusC9QMAAwsDFgMhAy0DOANDA08DWgNmA3IDfgOKA5YDogOuA7oDxwPTA+AD7AP5BAYEEwQgBC0EOwRIBFUEYwRxBH4EjASaBKgEtgTEBNME4QTwBP4FDQUcBSsFOgVJBVgFZwV3BYYFlgWmBbUFxQXVBeUF9gYGBhYGJwY3BkgGWQZqBnsGjAadBq8GwAbRBuMG9QcHBxkHKwc9B08HYQd0B4YHmQesB78H0gflB/gICwgfCDIIRghaCG4IggiWCKoIvgjSCOcI+wkQCSUJOglPCWQJeQmPCaQJugnPCeUJ+woRCicKPQpUCmoKgQqYCq4KxQrcCvMLCwsiCzkLUQtpC4ALmAuwC8gL4Qv5DBIMKgxDDFwMdQyODKcMwAzZDPMNDQ0mDUANWg10DY4NqQ3DDd4N+A4TDi4OSQ5kDn8Omw62DtIO7g8JDyUPQQ9eD3oPlg+zD88P7BAJECYQQxBhEH4QmxC5ENcQ9RETETERTxFtEYwRqhHJEegSBxImEkUSZBKEEqMSwxLjEwMTIxNDE2MTgxOkE8UT5RQGFCcUSRRqFIsUrRTOFPAVEhU0FVYVeBWbFb0V4BYDFiYWSRZsFo8WshbWFvoXHRdBF2UXiReuF9IX9xgbGEAYZRiKGK8Y1Rj6GSAZRRlrGZEZtxndGgQaKhpRGncanhrFGuwbFBs7G2MbihuyG9ocAhwqHFIcexyjHMwc9R0eHUcdcB2ZHcMd7B4WHkAeah6UHr4e6R8THz4faR+UH78f6iAVIEEgbCCYIMQg8CEcIUghdSGhIc4h+yInIlUigiKvIt0jCiM4I2YjlCPCI/AkHyRNJHwkqyTaJQklOCVoJZclxyX3JicmVyaHJrcm6CcYJ0kneierJ9woDSg/KHEooijUKQYpOClrKZ0p0CoCKjUqaCqbKs8rAis2K2krnSvRLAUsOSxuLKIs1y0MLUEtdi2rLeEuFi5MLoIuty7uLyQvWi+RL8cv/jA1MGwwpDDbMRIxSjGCMbox8jIqMmMymzLUMw0zRjN/M7gz8TQrNGU0njTYNRM1TTWHNcI1/TY3NnI2rjbpNyQ3YDecN9c4FDhQOIw4yDkFOUI5fzm8Ofk6Njp0OrI67zstO2s7qjvoPCc8ZTykPOM9Ij1hPaE94D4gPmA+oD7gPyE/YT+iP+JAI0BkQKZA50EpQWpBrEHuQjBCckK1QvdDOkN9Q8BEA0RHRIpEzkUSRVVFmkXeRiJGZ0arRvBHNUd7R8BIBUhLSJFI10kdSWNJqUnwSjdKfUrESwxLU0uaS+JMKkxyTLpNAk1KTZNN3E4lTm5Ot08AT0lPk0/dUCdQcVC7UQZRUFGbUeZSMVJ8UsdTE1NfU6pT9lRCVI9U21UoVXVVwlYPVlxWqVb3V0RXklfgWC9YfVjLWRpZaVm4WgdaVlqmWvVbRVuVW+VcNVyGXNZdJ114XcleGl5sXr1fD19hX7NgBWBXYKpg/GFPYaJh9WJJYpxi8GNDY5dj62RAZJRk6WU9ZZJl52Y9ZpJm6Gc9Z5Nn6Wg/aJZo7GlDaZpp8WpIap9q92tPa6dr/2xXbK9tCG1gbbluEm5rbsRvHm94b9FwK3CGcOBxOnGVcfByS3KmcwFzXXO4dBR0cHTMdSh1hXXhdj52m3b4d1Z3s3gReG54zHkqeYl553pGeqV7BHtje8J8IXyBfOF9QX2hfgF+Yn7CfyN/hH/lgEeAqIEKgWuBzYIwgpKC9INXg7qEHYSAhOOFR4Wrhg6GcobXhzuHn4gEiGmIzokziZmJ/opkisqLMIuWi/yMY4zKjTGNmI3/jmaOzo82j56QBpBukNaRP5GokhGSepLjk02TtpQglIqU9JVflcmWNJaflwqXdZfgmEyYuJkkmZCZ/JpomtWbQpuvnByciZz3nWSd0p5Anq6fHZ+Ln/qgaaDYoUehtqImopajBqN2o+akVqTHpTilqaYapoum/adup+CoUqjEqTepqaocqo+rAqt1q+msXKzQrUStuK4trqGvFq+LsACwdbDqsWCx1rJLssKzOLOutCW0nLUTtYq2AbZ5tvC3aLfguFm40blKucK6O7q1uy67p7whvJu9Fb2Pvgq+hL7/v3q/9cBwwOzBZ8Hjwl/C28NYw9TEUcTOxUvFyMZGxsPHQce/yD3IvMk6ybnKOMq3yzbLtsw1zLXNNc21zjbOts83z7jQOdC60TzRvtI/0sHTRNPG1EnUy9VO1dHWVdbY11zX4Nhk2OjZbNnx2nba+9uA3AXcit0Q3ZbeHN6i3ynfr+A24L3hROHM4lPi2+Nj4+vkc+T85YTmDeaW5x/nqegy6LzpRunQ6lvq5etw6/vshu0R7ZzuKO6070DvzPBY8OXxcvH/8ozzGfOn9DT0wvVQ9d72bfb794r4Gfio+Tj5x/pX+uf7d/wH/Jj9Kf26/kv+3P9t//9wYXJhAAAAAAADAAAAAmZmAADypwAADVkAABPQAAAKwHZjZ3QAAAAAAAAAAAADAQAAAgAAAFYBIwGwAlkDFQPkBLEFjQZtB1EIPAklChgLEgwIDQQOBw8REBURHhIsEz4UThVnFnoXjRifGa4auRvGHNsd8R8OIC8hUiJxI4oknSWvJrsnxSjQKdgq3ivhLOUt6S7vL/Mw+zIEMww0FDUbNiI3JjgpOSw6LTstPCs9KT4nPyVAIUEfQhxDGUQURQ9GB0b/R/dI7UnjSthLzEzBTbVOqU+fUJhRlFKTU5JUkVWQVo5XiliHWYNaflt4XHJda15mX2NgZWFqYnFjfGSHZZBmmGehaKlpr2q2a7tswG3Gbs5v2HDocfxzFHQudUd2YXd7eJR5q3rDe9p88H4FfxiAKIE1gkCDR4RNhVGGVYdXiFqJXIpdi16MXo1ejmCPZJBskXuSjpOmlL6V1pbtmASZGpowm0WcWp1unoOfmqCyoc2i66QJpSemRqdkqIGpn6q8q9is9K4PryewOrFJslOzWbRetWK2ZrdquG65cbp0u3a8eL16vn2/gcCJwZfCp8O8xNDF5cb5yA3JIcozy0bMWM1pznrPh9CR0ZbSl9OU1JDVitaE133Ydtlu2mbbXtxW3U3eRd884DXhL+Ir4yfkJOUg5h3nGegW6RLqD+sL7AftA+3+7vjv7fDZ8b3ymvNy9Ef1HfXz9sn3ofh4+U/6Jfr8+9L8qP1+/lT/Kv//AAAAKwDEAZUCWQMSA8gElAVzBlIHJwgJCPQJ2wrLC8QMuw22DrgPuBC7EcQSyxPbFOoV9hcEGBAZGRoeGyIcKh03Hk4faiCAIZciqSO2JMIlySbOJ88o0SnRKs8rzSzLLccuwy/BMMAxwDLBM8E0wTW/Nrw3uji2ObE6qzujPJo9kj6JP39AdEFrQmBDVERGRTlGK0cdSA1I/UnsStpLyEy1TaJOkE9+UHFRZVJbU1JUSlVCVjhXLlgkWRlaDlsCW/Vc6F3cXtFfyWDEYcNixmPJZM1l0mbWZ9lo3Gneat9r4GzhbeJu5W/qcPNyAXMSdCV1N3ZJd1x4bXl+eo57nnytfbt+yH/TgNuB4YLlg+eE6IXphuqH6ojpieiK5ovljOKN4Y7gj+OQ6ZH1kwSUFpUoljuXTJhemW+agJuQnKCdsZ7Cn9Wg6qIDox2kOaVWpnKnjaipqcOq3av3rQ+uJq87sE2xWrJls2y0crV4tn23griHuYu6j7uTvJa9mr6fv6bAscHAwtLD6MT+xhTHKshAyVbKa8uAzJTNqM68z83Q29Hl0uzT8NT01ffW+tf92P/aAdsD3ATdBd4G3wfgCuEQ4hjjI+Qv5TvmRudR6FzpZ+px63vshe2P7pjvn/Cj8aLynfOV9Iz1gvZ392z4YflV+kr7Pvwy/SX+Gf8M//8AAAArAMQBcAIuAu0DlgRTBSAF7QbGB5gIbglPCjgLHwwEDPEN5Q7YD8kQxRG+ErwTvRS8Fb0WwxfJGNEZ4hr+HB8dSR52H6IgySHpIwMkGiUrJj0nSihVKV8qaCtwLHYtey6BL4cwjDGSMpkzoDSnNaw2sDe0OLc5uDq3O7Y8tD2wPq0/pkChQZpCkEOHRH5FckZnR1pITEk9Si9LHkwNTPxN607aT8tQvVGxUqhTn1SXVY1Wg1d5WG5ZYlpWW0hcOl0sXh9fE2AKYQViA2MCZANlBWYGZwdoB2kGagVrBGwCbQBt/m79b/9xBnIPcxt0KXU4dkd3VHhheW56eXuFfI59mH6hf6aAqYGogqWDoISahZSGjYeEiH2JdIpsi2OMWY1QjkiPQpA/kUGSSJNRlF2VaJZzl3+YiZmTmpybpZytnbaev5/JoNah56L5pA2lIKY0p0eoWqltqn+rkKyhrbGuwK/LsNOx2LLas9q02LXXttS30rjPuc26yrvHvMS9wr7Bv8LAx8HQwt3D7cT9xg7HHsguyT3KTMtbzGnNd86Dz47QltGa0pzTm9SZ1ZbWlNeQ2I3ZidqF24Lcft173njfeOB74YHii+OY5KbltObD59Do3unr6vjsBe0S7h/vLfA/8VXycfOR9LP11fb3+Bn5O/pc+338nv2+/t///wAAbmRpbgAAAAAAAAY2AACmFwAAVc8AAEu5AACesQAAJekAAA0hAABQDQAAVDkAAkAAAAIhRwACFwoAAwEAAAIAAAABAAUACwASABsAJQAxAD4ATQBdAG4AgQCVAKoAwADYAPEBCwEmAUMBYAF/AaABwgHmAgwCNAJdAoYCsQLcAwgDNQNkA5UDyQP/BDcEcgSvBO0FLgVxBbcF/gZHBpEG3gcrB3oHywgeCHMIygkkCYAJ3go/CqILCAtwC9oMRgy1DSUNmA4NDoUO/w99D/0QfxEFEY0SGBKlEzUTxxRbFO8VhBYZFrAXSRfkGIIZIxnGGmwbFRvBHG8dIB3SHoUfNx/pIJshTSIBIrgjciQuJOwlriZxJzgoASjMKZgqZSswK/oswy2LLlUvIS/vML8xkTJmMz00FjTyNdE2szeYOII5cTpkO1w8WD1XPlk/X0BmQXFCf0OPRKNFuEbPR+VI+EoHSxRMH00sTjpPTFBfUXZSj1OqVMhV6VcMWDBZVVp6W55cwl3nXw5gNmFgYo1jvWTuZiJnWWiRac1rDWxTbaBu9nBUcbhzH3SKdfd3Z3jZek97yH1DfsKAQ4HFg0eExYY+h7WJKoqhjBmNlY8TkJSSGJOflSmWtZhEmdibc50WnsSge6I6o/6lyKeVqWWrOa0RruuwybKqtI62dbhduka8Lb4Vv//B7MPcxc/Hxcm8y7fNtc+10brTwtXQ1+vaHNxp3s/hRuPE5kPow+tG7c3wWfLp9X74GPq2/Vj//wAAAAIABQALABMAHAAmADMAQQBQAGEAcwCGAJsAsQDIAOEA+wEWATMBUAFvAZABsgHWAfwCJAJOAnkCpQLRAv0DLANcA44DwwP6BDMEbwStBO4FMAV1BbwGBQZQBp4G7Qc+B5AH5Ag6CJII7AlJCagKCQptCtMLPAuoDBYMhgz5DW8N5g5gDt0PXQ/fEGQQ6xF2EgMSlBMnE70UVhTxFY4WKxbJF2gYCRirGVAZ+BqjG1AcAByzHWkeIh7dH5ogWCEVIdIijiNLJAokyiWNJlMnGyfmKLQphCpXKywsAyzaLbEuhi9aMC4xBDHcMrYzkjRxNVI2NjccOAU48TngOtI7yTzEPcQ+xz/PQNlB5kL2RAhFHkY3R1JIcUmRSrRL1Uz1ThJPLFBGUWBSfVObVL1V4VcHWDBZXFqKW7lc6l4cX01gfWGtYt1kDmVBZndnr2jpaiZrZmyobe1vNnCCcdRzLHSMdfF3XXjMej57s30rfqaAI4GkgyeErYY1h76JRorKjEuNyY9GkMOSQ5PFlUmW0JhameebdZ0HnpugM6HQo3SlIKbUqI+qTqwQrdWvnbFosze1CLbduLW6j7xsvknAJMH8w9LFqMeAyVvLOc0azv7Q5dLP1LvWq9id2pTckd6X4KviyuTy5x/pUOuF7b7v+fI59Hz2wvkN+1r9q///AAAAAgAGAAwAFQAfACsAOABIAFkAawB/AJUArADEAN4A+gEWATUBVAF1AZgBvAHhAggCMAJYAoACqQLSAvwDJwNUA4MDtQPpBB8EWASSBM8FDgVPBZIF1wYeBmgGswcAB08HoAfyCEYInAj0CU8JqwoKCmsKzws2C54MCgx3DOgNWw3QDkkOxA9BD8IQRRDLEVQR4BJuEwATlBQrFMQVYBX8FpoXOBfYGHoZHxnHGnEbHhvOHIEdNx3wHqwfaSAnIOUhoyJgIx8j3yShJWYmLib4J8UolSlnKjwrFCvtLMctoC54L1AwKDEBMdwyuTOZNHw1YTZJNzM4ITkROgQ6/Dv5PPw+Az8PQB9BMkJIQ2JEfkWdRr9H5EkMSjZLYkyMTbVO2k/9USBSQ1NpVJFVu1bpWBlZTFqCW7tc9l4zX3FgrmHpYyRkYGWdZt1oHmljaqpr821Abo9v4XE2co9z7nVUdsF4NHmteyt8q34vf7aBQILMhFuF7YeBiReKroxEjdePZZDwknmUBJWQlx+YsZpGm96deJ8WoLaiWqQCpa+nZKkhquassK6AsFKyKLQCtd63vbmfu4S9a79TwT3DJMUHxubIwMqazHTOUdAw0hPT+NXg18vZuNup3ZvfjuF/42rlT+cu6Qrq5+zG7qfwivJw9Fj2Q/gx+iH8E/4I//8AAHNmMzIAAAAAAAEMQgAABd7///MmAAAHkgAA/ZH///ui///9owAAA9wAAMBsbW1vZAAAAAAAAAYQAACSNgJtAwDF8HYAAAAAAAAAAAAAAAAAAAAAAP/bAEMAAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAf/bAEMBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAf/AABEIAPcA9wMBEQACEQEDEQH/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fr/2gAMAwEAAhEDEQA/AP7MKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgDz/wAV/Ff4a+B2eLxZ458MaHcoMmwvNXtP7UIGcsmlRSSalIoPDMlqwDFVJBZQQDxPU/20v2fdPcxweKtS1dlfYx0zw1r2wEbwzCTULHT45EUoBvhaRX8xGiMibmUAzov24fgJJIiPqniOBWOGml8N3pjjH95xC00pH+5E7e1AHoPh/wDai+AniV0jsfiVodpK+3MevJf+GgjsuTG0/iCz021LKflLRzyRlhhJHBBIB7lZX1lqVtFe6deWt/Zzrugu7K4iuraZc43RTwPJFIuQRlHYZ70AWqACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoA+XvjV+1b8PPhC11o0Mh8X+NIQyN4b0i5jSHTpuy6/q2yeDTG6k2cUN7qY/dmWxhhmS4oA/MX4k/tUfGP4kyXMFz4km8M6HMXVNA8KPNpFr5DfL5V5exSnVdSDoB5yXl9Jau+5o7WBG8sAHzmzMzFmJZmJZmYkszE5JJPJJPJJ5J5NACUAFABQB1vhLx54z8B339o+DfE+teHLosrSnS7+e3gutv3UvrQMbS/iB58m9gnhJAJQkCgD79+En7e13HLbaP8YdKjuLciOEeL/Dtp5V1G3Q3Gs6Ej+RcKxJeafRRatEi7YNHuHNAH6R+HfEmgeLdIs9f8M6vYa5o1+he11HTbhLm2l2krIhdCTHPC4aK4t5Qk9vMrwzxxyoygA26ACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgBruqKzuyoiKXd3IVVVQSzMxICqoBJJIAGSTQB+Xv7S/7Y095Jf+AvhBqbQWKGS013xzZuyXF46s8c9h4ZnGDDZDG2XXYj512Sf7LeK1VL29APzdd2dmd2Z3di7u5LM7MSWZmJJZmJJJJJJJJOaAG0AFABQAUAFABQAUAewfB/42+Nvgvrq6p4ZvWn0u5ljOueGbyWVtG1uBcK3nQgn7Lfxx5FnqluourZvlbz7R7i0nAP22+Efxc8KfGTwpb+JvDNxslTy7fW9EuJEOpaDqRTc9neIuN8T4Z7K+RRBfQDzI9kqXEEAB6lQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQB+aX7Z37R89pJe/B3wNqDwzbDF481mzkKyIsqZ/4RW0uEYFS8Tb9fePnY8ekmUE6rbAA/MSgAoAKACgAoAKACgAoAKACgD1D4R/FfxL8HvGVj4s8PSmREK22taPJK8dlruku6m50+7C7gr4Hm2V1skeyvEiuVSRVeGUA/erwJ420H4i+E9F8ZeGrn7TpOt2i3EW7aLi1nUmO70+8jVmEV7YXSS2l3GGdBNExikkiZJHAOuoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKAPCf2i/i5F8HPhpqniG3eJvEWouNE8K28gWQPrV5FKy3ksRYF7XS7aKfUJ8jy5HhgtHZWu4yQD8FLq6ub66ub29uJru8vJ5rq7uriR5ri5ubiRpZ7ieaQtJLNNK7ySyOzO7szMSxJoAgoAKACgAoAKACgAoAKACgAoAKAPuL9iX4zS+DPG4+HOs3RHhjx1dJHp3muBFpfi0osVlKmfux65HHHpM6LkyXn9lPlEimLgH7DUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAH4uftsfEp/Gvxan8M2dyZND+HkDaHDGkitBJr1wY7jxFdAAkrNHOtro0ysco+jkgKXfcAfHVABQAUAFABQAUAFABQAUAFABQAUASwTz2s8N1bSyQXNtLHPbzwu0csM8LiSKWKRSGSSORVdHUhlYBgQRmgD+gv4H/ENfij8LfCPjJ2U6hfacLTW0XaPL13TJH0/Vj5aqoijuLu3kvLePHy2tzBgsCGIB6xQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAGB4r8QW3hTwv4j8UXgzaeHNC1bXLhc4Lw6VYT30ka88tIsBRAOWZgByRQB/OJqeo3msalqGr6hM1xf6pfXeo31w5Jee8vriS5uZmJJJaWaV3YkkkscknmgCjQAUAFABQAUAFABQAUAFABQAUAFABQB+nv/BPTxi8lp8QPAE8o228+n+LtLizlz9qQaPrbcn/AFaG20HaFGA80pblhkA/SugAoAKACgAoAKACgAoAKACgAoAKACgAoAKAPmf9r/XW0P8AZ+8cmNylxqy6NocJz95dS1uwS9Q85O/TEvhxnkjPGaAPwvoAKACgAoAKACgAoAKACgAoAKACgAoAKAPrf9iTXH0n4+6HZByieJNC8SaJN821XSLTX19Efswa40KEqpIzKI8ZbAIB+2NABQAUAFABQAUAFABQAUAFABQAUAFABQAUAfFP7elyIPgjZRGVozeePNBtggLATldM1+78pwvDKBamfD/LuhVh84SgD8baACgAoAKACgAoAKACgAoAKACgAoAKACgD3n9mCeS2+PvwxkiIDN4hMB3DI8u60++tZuPUxTOFP8LEN2oA/e+gAoAKACgAoAKACgAoAKACgAoAKACgAoAKAPjf9uqxlu/gVLcRjK6Z4v8AD19McZ2xSLqGmgg/wnztRiGfQlf4qAPxfoAKACgAoAKACgAoAKACgAoAKACgAoAKAPoT9lTT5NS/aC+GkEYYmLVr7UGK7eE0vQ9U1KQkuQNu20IbncQdqBpCqkA/eSgAoAKACgAoAKACgAoAKACgAoAKACgAoAKAPGv2hfC0njL4KfEfQYY/OupPDd1qdnCBl5r7w/JFr9nBH0xLcXOmRQRkkLvkG8hdxoA/n8oAKACgAoAKACgAoAKACgAoAKACgAoAKAPuL9gjwzJqvxc1bxE6ZtfCvhS+cS7d23UtaubbTrSLJ+55lh/a77wd37nYFKu5UA/YagAoAKACgAoAKACgAoAKACgAoAKACgAoAKAEZVZWVgGVgVZWAKspGCGByCCCQQeCOtAH89vxt8BSfDT4p+MvCHlGKysNXnudG+8VfQdSxqGjFXb77R6fcwW87DIW5hnjyShoA8qoAKACgAoAKACgAoAKACgAoAKACgAoA/Yz9hLwI3hv4UX3i26hMV/491mS6iZkMbtoehGfTNMDBvnIa/fW7qFzhJLe7hkjBVvMkAPtygAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgD88/wBvT4UtrHh3SPivpVuXvvDAi0PxII1JaTw/e3TNpt62O2l6tdSQPgFmi1fzHIitMgA/KOgAoAKACgAoAKACgAoAKACgAoAKAOp8EeEtT8eeLvDvg7R1zqPiLVrTTIHKPJHbLcSAXF9OqfP9lsLYTX12y8pbW8r/AMNAH9EnhvQNN8KeH9E8M6PF5Ol6BpVjpFhGdu8Wun20dtE0rKqh5pFjEk8uA0szPI2WckgG3QAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQBma1o2m+ItI1PQdZtIr7StYsbrTdRs5hujubO8heC4ibuN0bsAwIZGw6kMAQAfz/wDxo+Fuq/B/4gaz4O1HfNaxSG+0DUXUAat4fu5Zf7OvuOBMFjktL6NcrDqFrdwo0kaJK4B5VQAUAFABQAUAFABQAUAFABQAUAfp1+wX8IXij1P4xa1bYNwt14f8GrMnJiD+XrutxZBwHkQ6LayqQ2I9ZiddjxswB+l1ABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAfNv7TXwLt/jV4IdNOjhh8b+HFnv/C16/lx/amZQbzQbuZgNtpqqRoInZ0S11GO0uncW63UcwB+Gd7ZXmm3l1p+oWs9lf2NxNaXtndRPBc2t1byNFPb3EMgWSKaGVGjljdQ6OpVgCDQBVoAKACgAoAKACgAoAKACgD1X4M/CvV/jD490jwfpglhtJZBea/qiLlNI0K3dDf3pLK6eeystrYRuCs+oXFtE+2NpJEAP390HQ9L8M6LpXh7RLSOx0jRbC103TrSIYSC0tIlhhTP3ncqu6WVyZJpGeWRmkdmIBrUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAfn1+19+zJN4uS7+KfgCxEniW0tg/inQLSD994htLZGzrFiqv8AvNas7dEjuLNIjJqtpGrQsdQt1g1AA/JygAoAKACgAoAKACgAoAv6Xpeo63qVho+k2dxqGqapeW9hp9jaxmW5vL27lWC2t4I15eWaV1RB6tyQMmgD9y/2a/gTD8EPB81rfT2uoeLPETWl/wCJL+3t1RbeaKDEOiWtyXeS60/S3lnEU7CL7TczXV2IYVnSGIA+jqACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoA/Gr9t74XaZ4E+I+m+JNBsY9P0fx9YXeoT2tuix2sXiPTbiOPWmtoo1VII7uG90u/kjGd17dXsi4RwiAHxZQAUAFABQAUAFABQB+kf/AAT/APhvZX174r+KOpWiXE2jTx+F/DM0iq62t/c2gvNfuogyny7tNPu9Ms4ZkYOtrqN/Efln5AP1FoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoA+E/2/tCW++FPhzXUjDT6D40tYnkIbMdhq+l6lDcAEAgb7210wHftBxw4bCOAfkHQAUAFABQAUAFABQB+4n7GuhLon7P/AIRmKGO41661/XboFcbmuNZvLK0kz1YSaZp9i4Y9iAMqASAfUlABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAHy1+2dZx3P7O/jad9u7T7vwpeQ7kVz5j+LNFsDsY8xt5V9Ll1+YqWjPyyNQB+HlABQAUAFABQAUAFAH9BnwDslsPgl8KYFCASeAfC96dmdu7UtJttRYndzvLXRMnbzC23K4NAHrlABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAHxR+3Z43s9B+ECeEPNjbU/Hes6fbx2uR5o0rw/eWuu398AVJ2Q39to9ocFGZr4YLKsikA/G6gAoAKACgAoAKACgD92/wBlHxtZ+Nfgd4KMEyNfeF9Pj8Harbh90lpceH447OyWQZJH2nRxpt6nbbcbByjAAH0bQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAHm3xQ+K/gz4R+HZfEPjDU0tlKyppmlwFJdX1u7RQRZ6XZb1eZ9zIJrhzHZ2ayLLeXEERDkA/DP4w/FjxD8ZPGt94v17bbRsi2Wi6PDK8tpomjwM7W9hA7hWmkZ5JLm9umSM3V7PPMsUEJhtoQDyygAoAKACgAoAKACgD6A/Z5+O+rfA7xa1/5U+p+E9aEFr4p0OOQK80ETkwapp4dliXVtN8yU24lZYrqCa4sppIfPjurYA/bvwT468K/ETQLTxN4P1m11nSbtR+9gfE9rPtDSWeoWr7biwvodw861uo45lBVwrRvG7gHW0AFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQB4t40/aH+DPgIyxeIPH2h/bot6vpejzP4g1RJU/5YT2eipfS2UrkgL9v+yx87mdUBYAHxb8Sv+CgE0qXGn/Crws1tuVo18SeLhHJMhJZDJZaBYzyQKwG2W3uL/Up1JYLc6V8rIwB+e3ivxf4n8cazceIPF2uahr+sXOFkvdRnaV1jUkpb28Y2wWlrEWbybS1ihtoQxEUSAmgDm6ACgAoAKACgAoAKACgAoA7jwH8SPG3wz1ca34I8Q32h3pCrcpAyy2OoQqSRb6lp1wstjfwAklEuoJfKc+bCY5QsgAP0S+G/7f8Ao9zHb2HxS8L3OmXYVUfxD4WH23Tpn5zNdaJdzJfWKBQC7Wd7qzSSMdlrDHwAD7M8F/G34UfENoovCPjvQNUvJiBFpcl02mazIWxwmjasljqkgBIUsloyhiF3ZYZAPUqACgAoAKACgAoAKACgAoAKACgAoAKAMvWtc0bw5pl1rXiDVdP0XSbFPMu9S1S7gsrK3QkKpluLh441LuypGpbfJIyxxhnZVIB8IfE/9vbwlojT6b8MNEl8X36F4/7e1gXGl+HYmU4ElvZgR6xqq5BVkkGipgrJDdTrwQD4A+IP7QPxc+Jhmi8T+MdSOlzFgdB0l/7G0MRnpFLp+n+Sl8qZOyTU3vrgAkGY5oA8ZoAKACgAoAKACgAoAKACgAoAKACgAoAKAFBIIIJBByCDggjkEHqCD3oA+gPh5+0/8ZfhuYINL8V3Gt6PCVH9geKvM13TPLU5EMEk8yanp8XLfu9M1GyQliWViBgA/Qb4W/ty/Dvxc1tpnju0m8Aa1KRH9tmkOoeFp5CQqn+00RLvTDKcsy6jZrZWy/6zVZOtAH2vZXtnqVpb3+nXdrf2N3Es9re2VxFdWlzC4yk1vcwPJDNE45WSN2RhyCaALVABQAUAFABQAUAFABQAUAfI3x2/a48GfCf7X4f8Pi38Y+O4xJE+m20+dH0K4AK516/gYk3ET8vo9kxvTsaO7m0zfFK4B+TPxI+Lfj74saodU8a6/c6iI5HksdLiJttF0pXyPL03TI2+zwYQiNrhxLezooN1dTvlyAebUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAezfCj49fEj4PXiP4W1qSbRWmEt74W1UyXvh+9BYmQi0aRX0+4lJy97pktnduyoJpZolMTAH66fA/9pnwJ8aYI7C3f/hHPGccLSXfhTUrmN5pvLXdNcaHe7YU1i0Rcs4WG3v4FWR7ixigVJ5AD6OoAKACgAoAKACgBCQASSAACSScAAckknoB3NAH5hftOfthTzTal8PfhHqJhtomez1/x1Yz/vrqRSyXOneGZox+5tkOY7jXYpDLdNvTSzFbol/eAH5ru7OzO7M7uxd3clmdmJLMzEkszEkkkkkkknNADaACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAs2d7eadd21/p93c2N9ZzxXNne2c8trd2tzC4khuLa5gdJoJ4pFV4pYnWSNwGVgwBoA/WP9l79rZfG8tj8PfibdW9t4tZY7bQPEsmy3tvE8g+VNP1FQEgtdfcbRbSRiO21dswqkOo+VHqAB9+UAFABQAUAFAH5w/tpftEzaSl18HfBV80WoXVuo8datbPh7Syu4Vki8NW0oyy3F9bypPrEsbIYbN4dPDyNd38VuAflrQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFADldkZXRmR0YOjqSrKynKsrAgqykAgggg8g5oA/Y/9kL9oh/iboh8CeL73zPHfhqyRrW+uJMzeKdCg2Qi9eRjum1jTsxQ6rvJmvIng1MNPK2otbgH2vQAUAFAHn/xU8dWvw0+HvivxvdiN/wCwtJnns4JSAl3qs5W00iyb50O271O4tIJCjb1jkd1DMuCAfzz6rqmoa5qeo6zqt1Le6nqt7dajqF5M26W6vbyZ7i5nkPd5ZpHc4wATgADAoAz6ACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKAOv8A+M9V+HnjLw7400WRk1Dw/qcF8qBti3dsCYr/T5m2ti31KxkubG4wpbybiQqQ4VgAf0ReH9b0/xNoWjeItKl8/TNe0uw1jT5sYMlnqVrFeWzMOquYpk3qeVbKtgg0Aa9ABQB+en/AAUF8YNY+D/BPgi3mKv4h1u812/RGIZrHw/bJb28M4BwYbi+1hbhAwO6bTVYEGI5APyioAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgAoAKACgD9p/2IfGMnib4JWuk3M5lvPBet6l4ew7Fpv7Pl8rWNNdsknyo49TlsLfptjsPLAxGCQD7BoAKAPxo/bu8QNq3xtTSA48rwv4T0XTfLBOFub97vXZpWB6SSQapZo235THDDxu3EgHxdQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFAH6M/8ABPLxAYfEfxH8Ks4I1HRNH8QQxl/mQ6NfT6dcvGncSf29aLM/YxwA/eFAH6n0AFAH4H/tPao2r/Hz4n3bsWMXiI6YCd2duiWFloyD5iThUsFUc7cAbQFwAAeD0AFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQAUAFABQB9hfsN6k9j8ebG1UtjWfDHiPTZNvQpFBBrA3/Ovy+ZpSEfLJ84T5BnzEAP2moA/9k=";




}
