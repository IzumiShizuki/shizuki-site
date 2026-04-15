.class public final Llh/e;
.super Ljava/io/InputStream;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llh/h;


# direct methods
.method public synthetic constructor <init>(Llh/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Llh/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Llh/e;->b:Llh/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 1
    iget v0, p0, Llh/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llh/e;->b:Llh/h;

    .line 7
    .line 8
    check-cast v0, Llh/b0;

    .line 9
    .line 10
    iget-boolean v1, v0, Llh/b0;->c:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Llh/b0;->b:Llh/f;

    .line 15
    .line 16
    iget-wide v0, v0, Llh/f;->b:J

    .line 17
    .line 18
    const v2, 0x7fffffff

    .line 19
    .line 20
    .line 21
    int-to-long v2, v2

    .line 22
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    :goto_0
    long-to-int v1, v0

    .line 27
    return v1

    .line 28
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 29
    .line 30
    const-string v1, "closed"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    iget-object v0, p0, Llh/e;->b:Llh/h;

    .line 37
    .line 38
    check-cast v0, Llh/f;

    .line 39
    .line 40
    iget-wide v0, v0, Llh/f;->b:J

    .line 41
    .line 42
    const v2, 0x7fffffff

    .line 43
    .line 44
    .line 45
    int-to-long v2, v2

    .line 46
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final close()V
    .locals 1

    .line 1
    iget v0, p0, Llh/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llh/e;->b:Llh/h;

    .line 7
    .line 8
    check-cast v0, Llh/b0;

    .line 9
    .line 10
    invoke-virtual {v0}, Llh/b0;->close()V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final read()I
    .locals 7

    iget v0, p0, Llh/e;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, Llh/e;->b:Llh/h;

    check-cast v0, Llh/b0;

    iget-object v1, v0, Llh/b0;->b:Llh/f;

    iget-boolean v2, v0, Llh/b0;->c:Z

    if-nez v2, :cond_1

    .line 2
    iget-wide v2, v1, Llh/f;->b:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 3
    iget-object v0, v0, Llh/b0;->a:Llh/h0;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Llh/h0;->W(Llh/f;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1}, Llh/f;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :goto_0
    return v0

    .line 5
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :pswitch_0
    iget-object v0, p0, Llh/e;->b:Llh/h;

    check-cast v0, Llh/f;

    .line 7
    iget-wide v1, v0, Llh/f;->b:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    .line 8
    invoke-virtual {v0}, Llh/f;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 9

    iget v0, p0, Llh/e;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "data"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Llh/e;->b:Llh/h;

    check-cast v0, Llh/b0;

    iget-object v1, v0, Llh/b0;->b:Llh/f;

    iget-boolean v2, v0, Llh/b0;->c:Z

    if-nez v2, :cond_1

    .line 10
    array-length v2, p1

    int-to-long v3, v2

    int-to-long v5, p2

    int-to-long v7, p3

    invoke-static/range {v3 .. v8}, Landroid/support/v4/media/session/b;->y(JJJ)V

    .line 11
    iget-wide v2, v1, Llh/f;->b:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 12
    iget-object v0, v0, Llh/b0;->a:Llh/h0;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Llh/h0;->W(Llh/f;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Llh/f;->read([BII)I

    move-result p1

    :goto_0
    return p1

    .line 14
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :pswitch_0
    const-string v0, "sink"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Llh/e;->b:Llh/h;

    check-cast v0, Llh/f;

    invoke-virtual {v0, p1, p2, p3}, Llh/f;->read([BII)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Llh/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Llh/e;->b:Llh/h;

    .line 12
    .line 13
    check-cast v1, Llh/b0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ".inputStream()"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Llh/e;->b:Llh/h;

    .line 34
    .line 35
    check-cast v1, Llh/f;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ".inputStream()"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public transferTo(Ljava/io/OutputStream;)J
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Llh/e;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Ljava/io/InputStream;->transferTo(Ljava/io/OutputStream;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    return-wide v1

    .line 15
    :pswitch_0
    const-string v2, "out"

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Llh/e;->b:Llh/h;

    .line 21
    .line 22
    check-cast v2, Llh/b0;

    .line 23
    .line 24
    iget-object v3, v2, Llh/b0;->b:Llh/f;

    .line 25
    .line 26
    iget-boolean v4, v2, Llh/b0;->c:Z

    .line 27
    .line 28
    if-nez v4, :cond_4

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    move-wide v6, v4

    .line 33
    :cond_0
    iget-wide v8, v3, Llh/f;->b:J

    .line 34
    .line 35
    cmp-long v10, v8, v4

    .line 36
    .line 37
    if-nez v10, :cond_2

    .line 38
    .line 39
    iget-object v8, v2, Llh/b0;->a:Llh/h0;

    .line 40
    .line 41
    const-wide/16 v9, 0x2000

    .line 42
    .line 43
    invoke-interface {v8, v3, v9, v10}, Llh/h0;->W(Llh/f;J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    const-wide/16 v10, -0x1

    .line 48
    .line 49
    cmp-long v12, v8, v10

    .line 50
    .line 51
    if-eqz v12, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-wide v6

    .line 55
    :cond_2
    :goto_0
    iget-wide v13, v3, Llh/f;->b:J

    .line 56
    .line 57
    add-long/2addr v6, v13

    .line 58
    const-wide/16 v15, 0x0

    .line 59
    .line 60
    move-wide/from16 v17, v13

    .line 61
    .line 62
    invoke-static/range {v13 .. v18}, Landroid/support/v4/media/session/b;->y(JJJ)V

    .line 63
    .line 64
    .line 65
    iget-object v8, v3, Llh/f;->a:Llh/c0;

    .line 66
    .line 67
    :goto_1
    cmp-long v9, v13, v4

    .line 68
    .line 69
    if-lez v9, :cond_0

    .line 70
    .line 71
    invoke-static {v8}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget v9, v8, Llh/c0;->c:I

    .line 75
    .line 76
    iget v10, v8, Llh/c0;->b:I

    .line 77
    .line 78
    sub-int/2addr v9, v10

    .line 79
    int-to-long v9, v9

    .line 80
    invoke-static {v13, v14, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    long-to-int v10, v9

    .line 85
    iget-object v9, v8, Llh/c0;->a:[B

    .line 86
    .line 87
    iget v11, v8, Llh/c0;->b:I

    .line 88
    .line 89
    invoke-virtual {v1, v9, v11, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 90
    .line 91
    .line 92
    iget v9, v8, Llh/c0;->b:I

    .line 93
    .line 94
    add-int/2addr v9, v10

    .line 95
    iput v9, v8, Llh/c0;->b:I

    .line 96
    .line 97
    iget-wide v11, v3, Llh/f;->b:J

    .line 98
    .line 99
    int-to-long v4, v10

    .line 100
    sub-long/2addr v11, v4

    .line 101
    iput-wide v11, v3, Llh/f;->b:J

    .line 102
    .line 103
    sub-long/2addr v13, v4

    .line 104
    iget v4, v8, Llh/c0;->c:I

    .line 105
    .line 106
    if-ne v9, v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {v8}, Llh/c0;->a()Llh/c0;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iput-object v4, v3, Llh/f;->a:Llh/c0;

    .line 113
    .line 114
    invoke-static {v8}, Llh/d0;->a(Llh/c0;)V

    .line 115
    .line 116
    .line 117
    move-object v8, v4

    .line 118
    :cond_3
    const-wide/16 v4, 0x0

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 122
    .line 123
    const-string v2, "closed"

    .line 124
    .line 125
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v1

    .line 129
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
