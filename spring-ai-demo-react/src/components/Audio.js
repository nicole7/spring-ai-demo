import React, { useState } from "react";
import '@fortawesome/fontawesome-svg-core/styles.css';
import axios from "axios";

function Audio() {
    const [audioFile, setAudioFile] = useState(null);
    const [isExpanded, setExpanded] = useState(false)
    const [transcription, setTranscription] = useState('')

    const handleFileChange = (event) => {
        setAudioFile(event.target.files[0]);
    };

    const handleUpload = async () => {
        setExpanded(!isExpanded)

        const formData = new FormData();
        formData.append("file", audioFile);

        try{
            const response = await axios.post('http://localhost:8080/api/transcribe', formData, {
                headers: {
                    'Content-Type':'multipart/form-data',
                }
            });
            setTranscription(response.data)
        } catch (error) {
            console.error("Error transcribing ", error)
        }
       // const response = await fetch('/audio-generated-text'
    };

    return (
        <div className="file-container">
            <h2>Add Audio File</h2>
            <div className="file-group">
                <input
                    type="file"
                    accept="audio/*"
                    onChange={handleFileChange}
                />
                <button onClick={handleUpload} style={{width: '15rem'}}>
                    {isExpanded ?
                        <i className="fa fa-arrow-down" aria-hidden="true"></i>
                        : <i className="fa fa-arrow-up" aria-hidden="true"></i>
                    } View Response
                </button>
            </div>
            {transcription && isExpanded && <p>Generated Text: {transcription}</p>}
            <br></br>
            <divider style={{border: 'solid gray 1px'}}></divider>
        </div>
    );
}

export default Audio;