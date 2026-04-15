.class public final Lb9/b;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/io/File;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/b;->e:I

    .line 1
    iput-wide p1, p0, Lb9/b;->f:J

    iput-object p3, p0, Lb9/b;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLyb/c;I)V
    .locals 0

    .line 2
    iput p5, p0, Lb9/b;->e:I

    iput-object p1, p0, Lb9/b;->g:Ljava/lang/Object;

    iput-wide p2, p0, Lb9/b;->f:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 7

    .line 1
    iget p1, p0, Lb9/b;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb9/b;

    .line 7
    .line 8
    iget-object p1, p0, Lb9/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Le7/a0;

    .line 12
    .line 13
    iget-wide v2, p0, Lb9/b;->f:J

    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    move-object v4, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lb9/b;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v5, p2

    .line 22
    new-instance v1, Lb9/b;

    .line 23
    .line 24
    iget-object p1, p0, Lb9/b;->g:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, Lda/b1;

    .line 28
    .line 29
    iget-wide v3, p0, Lb9/b;->f:J

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    invoke-direct/range {v1 .. v6}, Lb9/b;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    move-object v5, p2

    .line 37
    new-instance v1, Lb9/b;

    .line 38
    .line 39
    iget-object p1, p0, Lb9/b;->g:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v2, p1

    .line 42
    check-cast v2, Lda/m0;

    .line 43
    .line 44
    iget-wide v3, p0, Lb9/b;->f:J

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    invoke-direct/range {v1 .. v6}, Lb9/b;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_2
    move-object v5, p2

    .line 52
    new-instance p1, Lb9/b;

    .line 53
    .line 54
    iget-object p2, p0, Lb9/b;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Ljava/io/File;

    .line 57
    .line 58
    iget-wide v0, p0, Lb9/b;->f:J

    .line 59
    .line 60
    invoke-direct {p1, v0, v1, p2, v5}, Lb9/b;-><init>(JLjava/io/File;Lyb/c;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
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
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb9/b;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lb9/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lb9/b;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lb9/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb9/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lb9/b;

    .line 27
    .line 28
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lb9/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lb9/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lb9/b;

    .line 39
    .line 40
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lb9/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lb9/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lb9/b;

    .line 51
    .line 52
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lb9/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb9/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 5
    .line 6
    iget-wide v3, p0, Lb9/b;->f:J

    .line 7
    .line 8
    iget-object v5, p0, Lb9/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    check-cast v5, Le7/a0;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "MusicScreen/"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v5, p1}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :pswitch_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast v5, Lda/b1;

    .line 40
    .line 41
    invoke-virtual {v5, v3, v4, v1}, Lda/b1;->w(JZ)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lg9/a;->a:Lef/l;

    .line 49
    .line 50
    check-cast v5, Lda/m0;

    .line 51
    .line 52
    invoke-virtual {v5}, Lda/m0;->A()Lbg/a2;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    iget-object p1, p1, Lbg/a2;->G:Ljava/lang/String;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 p1, 0x0

    .line 62
    :goto_0
    if-nez p1, :cond_1

    .line 63
    .line 64
    invoke-static {v3, v4}, Lna/w;->a(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "https://www.dlsite.com/maniax/work/=/product_id/"

    .line 69
    .line 70
    const-string v1, ".html"

    .line 71
    .line 72
    invoke-static {v0, p1, v1}, Lq/t0;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lna/c;->i(Landroid/net/Uri;)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :pswitch_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lag/z;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {v3, v4, p1, v1}, Lag/z;->h(JLjava/lang/String;Z)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast v5, Ljava/io/File;

    .line 98
    .line 99
    instance-of v0, p1, Lub/m;

    .line 100
    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    check-cast p1, Ljava/util/List;

    .line 104
    .line 105
    new-instance v0, Ljava/io/FileOutputStream;

    .line 106
    .line 107
    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 108
    .line 109
    .line 110
    :try_start_0
    sget-object v3, Lna/w;->a:Lxf/r;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v4, Lwf/d;

    .line 116
    .line 117
    sget-object v5, Lbg/o0;->Companion:Lbg/w;

    .line 118
    .line 119
    invoke-virtual {v5}, Lbg/w;->serializer()Lsf/a;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-direct {v4, v5, v1}, Lwf/d;-><init>(Lsf/a;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4, p1}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    sget-object v1, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v1, "getBytes(...)"

    .line 137
    .line 138
    invoke-static {p1, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    :catchall_1
    move-exception v1

    .line 151
    invoke-static {v0, p1}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw v1

    .line 155
    :cond_2
    :goto_1
    return-object v2

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
