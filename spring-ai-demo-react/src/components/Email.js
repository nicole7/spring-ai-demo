import React, { useState } from "react";

function Email() {

    const sendEmail = async () => {
        try {
            const response = await fetch('/send-email', {
                method: 'GET',
            });

            if (response.ok) {
                const result = await response.text();
                alert(`Email sent successfully: ${result}`);
            } else {
                alert('Failed to send email');
            }
        } catch (error) {
            console.error('Error sending email:', error);
            alert('Error sending email');
        }
    };

    return (
        <div style={{marginRight: "2px"}}>
            <br></br>
            <button onClick={sendEmail}>Send Email</button>
        </div>
    );
}

export default Email;