.class public final Lha/e;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lha/g;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lha/g;Ljava/lang/String;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lha/e;->e:I

    .line 1
    iput-object p1, p0, Lha/e;->f:Lha/g;

    iput-object p2, p0, Lha/e;->g:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lha/g;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lha/e;->e:I

    .line 2
    iput-object p1, p0, Lha/e;->g:Ljava/lang/String;

    iput-object p2, p0, Lha/e;->f:Lha/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, Lha/e;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lha/e;

    .line 7
    .line 8
    iget-object v0, p0, Lha/e;->f:Lha/g;

    .line 9
    .line 10
    iget-object v1, p0, Lha/e;->g:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, Lha/e;-><init>(Lha/g;Ljava/lang/String;Lyb/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lha/e;

    .line 17
    .line 18
    iget-object v0, p0, Lha/e;->g:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lha/e;->f:Lha/g;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1, p2}, Lha/e;-><init>(Ljava/lang/String;Lha/g;Lyb/c;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lha/e;->e:I

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
    invoke-virtual {p0, p1, p2}, Lha/e;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lha/e;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lha/e;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lha/e;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lha/e;

    .line 27
    .line 28
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lha/e;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lha/e;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lha/e;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lha/e;->f:Lha/g;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, v2, Lha/g;->d:Lx0/e1;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    const-string v0, "Bearer "

    .line 22
    .line 23
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    sget-object p1, Lna/w;->a:Lxf/r;

    .line 27
    .line 28
    const-string p1, "<this>"

    .line 29
    .line 30
    invoke-static {v1, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v1, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v1, "decode(...)"

    .line 44
    .line 45
    invoke-static {p1, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "#"

    .line 49
    .line 50
    const-string v3, "%23"

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {p1, v1, v3, v4}, Lef/u;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v1, Lcom/cnl/kikoeru/MainApplication;->b:Lug/x;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    new-instance v3, Lch/l;

    .line 62
    .line 63
    const/16 v5, 0xa

    .line 64
    .line 65
    invoke-direct {v3, v5}, Lch/l;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, p1}, Lch/l;->B(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p1, "authorization"

    .line 72
    .line 73
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-instance v6, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v3, p1, v0}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lb7/b1;

    .line 93
    .line 94
    invoke-direct {p1, v3}, Lb7/b1;-><init>(Lch/l;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, p1}, Lug/x;->a(Lb7/b1;)Lzg/n;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lzg/n;->f()Lug/d0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, Lug/d0;->g:Lug/f0;

    .line 106
    .line 107
    invoke-virtual {p1}, Lug/f0;->b()Llh/i;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Llh/i;->d()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, -0x1

    .line 116
    .line 117
    const/16 v1, 0x400

    .line 118
    .line 119
    if-le v0, v1, :cond_0

    .line 120
    .line 121
    const/16 v0, 0x400

    .line 122
    .line 123
    :cond_0
    invoke-virtual {p1, v4, v0}, Llh/i;->o(II)Llh/i;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Llh/i;->r()[B

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Lna/w;->d([B)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_2

    .line 136
    .line 137
    iget-object v1, v2, Lha/g;->c:Lx0/e1;

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_0
    move-exception p1

    .line 144
    goto :goto_0

    .line 145
    :cond_1
    const-string p1, "DEFAULT_OKHTTP_CLIENT"

    .line 146
    .line 147
    invoke-static {p1}, Ljc/l;->k(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x0

    .line 151
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    :goto_0
    invoke-static {p1}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :cond_2
    :goto_1
    invoke-static {p1}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-nez v0, :cond_3

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    sget-object p1, Llh/i;->d:Llh/i;

    .line 164
    .line 165
    const p1, 0x7f0c0154

    .line 166
    .line 167
    .line 168
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    sget-object v0, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 173
    .line 174
    const-string v1, "charset"

    .line 175
    .line 176
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Llh/i;

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const-string v0, "getBytes(...)"

    .line 186
    .line 187
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v1, p1}, Llh/i;-><init>([B)V

    .line 191
    .line 192
    .line 193
    move-object p1, v1

    .line 194
    :goto_2
    return-object p1

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
