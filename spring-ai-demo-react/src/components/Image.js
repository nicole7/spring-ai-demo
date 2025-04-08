import React, { useState } from "react";

import '@fortawesome/fontawesome-svg-core/styles.css'

function Image() {
    const [imageFile, setImageFile] = useState(null);
    const [responseText, setResponseText] = useState('Response text');
    const [isExpanded, setExpanded] = useState(false)

    const handleFileChange = (event) => {
        setImageFile(event.target.files[0]);
        generateText().then(r => {})
    };

    const toggleExpansion = () => {
        setExpanded(!isExpanded)
    }

    const generateText = async () => {
        if (!imageFile) {
            alert("Please select a file first.");
            return;
        }

        const formData = new FormData();
        formData.append("file", imageFile);

        try {
            const response = await fetch('/image-generated-text', {
                method: 'POST',
                body: formData,
            });

            if (response.ok) {
                const result = await response.text();
                setResponseText(result);
                alert('Text generated successfully');
            } else {
                alert('Failed to generate text');
            }
        } catch (error) {
            console.error('Error:', error);
            alert('Error generating text');
        }
    };

    return (
        <div className="file-container">
            <h2>Add Image File</h2>
            <div className="file-group">
            <input
                type="file"
                accept="image/png, image/jpg"
                onChange={handleFileChange} />
                <button onClick={toggleExpansion} style={{width: '15rem'}}>
                    {isExpanded ?
                        <i className="fa fa-arrow-down" aria-hidden="true"></i>
                        : <i className="fa fa-arrow-up" aria-hidden="true"></i>
                    } View Response
                </button>
            </div>
                {responseText && isExpanded && <p>Generated Text: {responseText}</p>}
            <br></br>
            <divider style={{border: 'solid gray 1px'}}></divider>
        </div>
    );
}

export default Image;