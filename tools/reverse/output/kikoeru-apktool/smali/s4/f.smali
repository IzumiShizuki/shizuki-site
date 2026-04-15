.class public final Ls4/f;
.super Ls4/c;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public e:Ls4/m;

.field public f:[B

.field public g:I

.field public h:I


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls4/f;->f:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Ls4/f;->f:[B

    .line 7
    .line 8
    invoke-virtual {p0}, Ls4/c;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Ls4/f;->e:Ls4/m;

    .line 12
    .line 13
    return-void
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

.method public final f(Ls4/m;)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Ls4/c;->c()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls4/f;->e:Ls4/m;

    .line 5
    .line 6
    iget-object v0, p1, Ls4/m;->a:Landroid/net/Uri;

    .line 7
    .line 8
    iget-wide v1, p1, Ls4/m;->g:J

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "data"

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    new-instance v5, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v6, "Unsupported scheme: "

    .line 27
    .line 28
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3, v4}, Lp4/c;->b(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget v4, Lp4/c0;->a:I

    .line 46
    .line 47
    const/4 v4, -0x1

    .line 48
    const-string v5, ","

    .line 49
    .line 50
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    array-length v4, v3

    .line 55
    const/4 v5, 0x2

    .line 56
    const/4 v6, 0x1

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    if-ne v4, v5, :cond_4

    .line 60
    .line 61
    aget-object v0, v3, v6

    .line 62
    .line 63
    aget-object v3, v3, v7

    .line 64
    .line 65
    const-string v4, ";base64"

    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    :try_start_0
    invoke-static {v0, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, p0, Ls4/f;->f:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception p1

    .line 81
    const-string v1, "Error while parsing Base64 encoded string: "

    .line 82
    .line 83
    invoke-static {v1, v0}, Lj2/h0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Lm4/p0;

    .line 88
    .line 89
    invoke-direct {v1, v0, p1, v6, v7}, Lm4/p0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_0
    sget-object v3, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v0, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Ls4/f;->f:[B

    .line 110
    .line 111
    :goto_0
    iget-wide v3, p1, Ls4/m;->f:J

    .line 112
    .line 113
    iget-object v0, p0, Ls4/f;->f:[B

    .line 114
    .line 115
    array-length v5, v0

    .line 116
    int-to-long v5, v5

    .line 117
    cmp-long v7, v3, v5

    .line 118
    .line 119
    if-gtz v7, :cond_3

    .line 120
    .line 121
    long-to-int v4, v3

    .line 122
    iput v4, p0, Ls4/f;->g:I

    .line 123
    .line 124
    array-length v0, v0

    .line 125
    sub-int/2addr v0, v4

    .line 126
    iput v0, p0, Ls4/f;->h:I

    .line 127
    .line 128
    const-wide/16 v3, -0x1

    .line 129
    .line 130
    cmp-long v5, v1, v3

    .line 131
    .line 132
    if-eqz v5, :cond_1

    .line 133
    .line 134
    int-to-long v3, v0

    .line 135
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    long-to-int v0, v3

    .line 140
    iput v0, p0, Ls4/f;->h:I

    .line 141
    .line 142
    :cond_1
    invoke-virtual {p0, p1}, Ls4/c;->e(Ls4/m;)V

    .line 143
    .line 144
    .line 145
    if-eqz v5, :cond_2

    .line 146
    .line 147
    return-wide v1

    .line 148
    :cond_2
    iget p1, p0, Ls4/f;->h:I

    .line 149
    .line 150
    int-to-long v0, p1

    .line 151
    return-wide v0

    .line 152
    :cond_3
    iput-object v8, p0, Ls4/f;->f:[B

    .line 153
    .line 154
    new-instance p1, Ls4/j;

    .line 155
    .line 156
    const/16 v0, 0x7d8

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ls4/j;-><init>(I)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, "Unexpected URI format: "

    .line 165
    .line 166
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v0, Lm4/p0;

    .line 177
    .line 178
    invoke-direct {v0, p1, v8, v6, v7}, Lm4/p0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 179
    .line 180
    .line 181
    throw v0
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

.method public final read([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget v0, p0, Ls4/f;->h:I

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    iget-object v0, p0, Ls4/f;->f:[B

    .line 16
    .line 17
    sget v1, Lp4/c0;->a:I

    .line 18
    .line 19
    iget v1, p0, Ls4/f;->g:I

    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Ls4/f;->g:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Ls4/f;->g:I

    .line 28
    .line 29
    iget p1, p0, Ls4/f;->h:I

    .line 30
    .line 31
    sub-int/2addr p1, p3

    .line 32
    iput p1, p0, Ls4/f;->h:I

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Ls4/c;->a(I)V

    .line 35
    .line 36
    .line 37
    return p3
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final w()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/f;->e:Ls4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ls4/m;->a:Landroid/net/Uri;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
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
