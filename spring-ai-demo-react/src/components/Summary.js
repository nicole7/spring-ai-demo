import React, { useState } from "react";

function Summary() {
    const [summarizedText, setSummarizedText] = useState('');

    const handleSummary = (event) => {
        setSummarizedText(event.target);
        // generateSummary().then(r => {})
    }
    const generateSummary = async () => {
        // get AIsummaryResponse
        const summary = "Hey this is some text"
           try {
               const response = await fetch( {
                   method: 'POST',
                   body: summary
               });

               if (response.ok) {
                   const result = await response
                   setSummarizedText(result)
               }
           } catch (error) {
                console.error('Error: '. error)
           }
        }

    return (
        <div style={{marginRight: "20px"}}>
            <br></br>
            <button onClick={handleSummary}>Summarize</button>
            {/*<div>{summarizedText}</div>*/}
            <div>
                { summarizedText && <p>This is summarized AI text</p> }
            </div>
        </div>
    );
}

export default Summary;