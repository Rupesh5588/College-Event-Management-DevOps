const BASE_URL = "/api";
async function loadEvents() {

    const response = await fetch(BASE_URL + "/events");

    const events = await response.json();

    const container = document.getElementById("event-container");

    container.innerHTML = "";

    events.forEach(event => {

        container.innerHTML += `

            <div class="event-card">

                <h3>${event.name}</h3>

                <p><b>Date:</b> ${event.date}</p>

                <p><b>Time:</b> ${event.time}</p>

                <p><b>Venue:</b> ${event.venue}</p>

                <p>${event.description}</p>

            </div>

        `;

    });

}

async function loadSpeakers() {

    const response = await fetch(BASE_URL + "/speakers");

    const speakers = await response.json();

    const container = document.getElementById("speaker-container");

    container.innerHTML = "";

    speakers.forEach(speaker => {

        container.innerHTML += `

            <div class="speaker-card">

                <h3>${speaker.name}</h3>

                <h4>${speaker.designation}</h4>

                <p>${speaker.topic}</p>

            </div>

        `;

    });

}

const form = document.getElementById("registrationForm");

form.addEventListener("submit", async function(e){

    e.preventDefault();

    const registration = {

        studentName:document.getElementById("studentName").value,

        email:document.getElementById("email").value,

        department:document.getElementById("department").value,

        eventName:document.getElementById("eventName").value

    };

    const response = await fetch(BASE_URL + "/register",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(registration)

    });

    const message = await response.text();

    alert(message);

    form.reset();

});

loadEvents();

loadSpeakers();