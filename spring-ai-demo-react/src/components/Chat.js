import React, { useState } from "react";

function Chat() {
    const [prompt, setPrompt] = useState('');
    const [responseText, setResponseText] = useState('');

    const chatAI = async () => {

        try {
            const response = await fetch('/chat-ai', {
                method: 'POST',
                body: prompt,
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
            <h2>Chat</h2>
            <textarea
                value={prompt}
                onChange={(e) => setPrompt(e.target.value)}
                placeholder="Enter text"
            />
        </div>
    );
}

export default Chat;