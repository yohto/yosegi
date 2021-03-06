/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.yahoo.yosegi.message.formatter.text;

import jp.co.yahoo.yosegi.message.objects.PrimitiveObject;
import jp.co.yahoo.yosegi.message.objects.LongObj;
import jp.co.yahoo.yosegi.message.objects.StringObj;
import jp.co.yahoo.yosegi.message.parser.IParser;
import jp.co.yahoo.yosegi.util.ByteArrayData;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.io.IOException;

public class TestTextShortFormatter {

  @Test
  public void T_write_shortText_withDouble() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , 0.1d );
    assertEquals( "0" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withFloat() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , 0.1f );
    assertEquals( "0" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withByte() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , (byte)1 );
    assertEquals( "1" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withShort() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , (short)1 );
    assertEquals( "1" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withInteger() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , 1 );
    assertEquals( "1" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withLong() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , 1L );
    assertEquals( "1" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withString() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , new String( "1" ) );
    assertEquals( "" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_write_shortText_withNull() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.write( buffer , null );
    assertEquals( "" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_writeParser_shortText_withLongObj() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.writeParser( buffer , new LongObj( 1 ) , null );
    assertEquals( "1" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

  @Test
  public void T_writeParser_shortText_withNull() throws IOException {
    TextShortFormatter formatter = new TextShortFormatter();
    ByteArrayData buffer = new ByteArrayData();
    formatter.writeParser( buffer , null , null );
    assertEquals( "" , new String( buffer.getBytes() , 0 , buffer.getLength() ) );
  }

}
