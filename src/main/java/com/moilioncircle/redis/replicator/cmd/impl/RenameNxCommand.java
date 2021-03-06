/*
 * Copyright 2016 leon chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class RenameNxCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String key;
    private String newKey;
    private byte[] rawKey;
    private byte[] rawNewKey;

    public RenameNxCommand() {
    }

    public RenameNxCommand(String key, String newKey) {
        this(key, newKey, null, null);
    }

    public RenameNxCommand(String key, String newKey, byte[] rawKey, byte[] rawNewKey) {
        this.key = key;
        this.newKey = newKey;
        this.rawKey = rawKey;
        this.rawNewKey = rawNewKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNewKey() {
        return newKey;
    }

    public void setNewKey(String newKey) {
        this.newKey = newKey;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    public byte[] getRawNewKey() {
        return rawNewKey;
    }

    public void setRawNewKey(byte[] rawNewKey) {
        this.rawNewKey = rawNewKey;
    }

    @Override
    public String toString() {
        return "RenameNxCommand{" +
                "key='" + key + '\'' +
                ", newKey=" + newKey +
                '}';
    }
}
