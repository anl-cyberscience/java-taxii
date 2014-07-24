/*
Copyright (c) 2014, The MITRE Corporation
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of The MITRE Corporation nor the 
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

package org.mitre.taxii.messages.xml11;

/**
 * Constants for the names of Status Detail fields.
 *
 * @author Jonathan W. Cranford
 */
public interface StatusDetails {
    
    String SDN_ACCEPTABLE_DESTINATION = "ACCEPTABLE_DESTINATION";
    String SDN_MAX_PART_NUMBER = "MAX_PART_NUMBER";
    String SDN_ITEM = "ITEM";
    String SDN_ESTIMATED_WAIT = "ESTIMATED_WAIT";
    String SDN_RESULT_ID = "RESULT_ID";
    String SDN_WILL_PUSH = "WILL_PUSH";
    String SDN_SUPPORTED_BINDING = "SUPPORTED_BINDING";
    String SDN_SUPPORTED_CONTENT = "SUPPORTED_CONTENT";
    String SDN_SUPPORTED_PROTOCOL = "SUPPORTED_PROTOCOL";
    String SDN_SUPPORTED_QUERY = "SUPPORTED_QUERY";

}
