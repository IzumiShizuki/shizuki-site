.class public final Lzg/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lug/u;


# static fields
.field public static final a:Lzg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzg/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzg/a;->a:Lzg/a;

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
.end method


# virtual methods
.method public final a(Lah/h;)Lug/d0;
    .locals 9

    .line 1
    iget-object v0, p1, Lah/h;->a:Lzg/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, v0, Lzg/n;->o:Z

    .line 5
    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    iget-boolean v1, v0, Lzg/n;->l:Z

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-boolean v1, v0, Lzg/n;->k:Z

    .line 13
    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    iget-boolean v1, v0, Lzg/n;->n:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-boolean v1, v0, Lzg/n;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    iget-object v1, v0, Lzg/n;->g:Lzg/h;

    .line 26
    .line 27
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Lzg/h;->a()Lzg/o;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, v0, Lzg/n;->a:Lug/x;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget v4, p1, Lah/h;->g:I

    .line 40
    .line 41
    iget-object v5, v2, Lzg/o;->h:Ltc/b0;

    .line 42
    .line 43
    iget-object v6, v2, Lzg/o;->i:Lch/p;

    .line 44
    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    new-instance v4, Lch/q;

    .line 48
    .line 49
    invoke-direct {v4, v3, v2, p1, v6}, Lch/q;-><init>(Lug/x;Lzg/o;Lah/h;Lch/p;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v6, v2, Lzg/o;->e:Ljava/net/Socket;

    .line 54
    .line 55
    invoke-virtual {v6, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 56
    .line 57
    .line 58
    iget-object v6, v5, Ltc/b0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Llh/b0;

    .line 61
    .line 62
    iget-object v6, v6, Llh/b0;->a:Llh/h0;

    .line 63
    .line 64
    invoke-interface {v6}, Llh/h0;->a()Llh/j0;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    int-to-long v7, v4

    .line 69
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 70
    .line 71
    invoke-virtual {v6, v7, v8}, Llh/j0;->g(J)Llh/j0;

    .line 72
    .line 73
    .line 74
    iget-object v4, v5, Ltc/b0;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Llh/a0;

    .line 77
    .line 78
    iget-object v4, v4, Llh/a0;->a:Llh/f0;

    .line 79
    .line 80
    invoke-interface {v4}, Llh/f0;->a()Llh/j0;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget v6, p1, Lah/h;->h:I

    .line 85
    .line 86
    int-to-long v6, v6

    .line 87
    invoke-virtual {v4, v6, v7}, Llh/j0;->g(J)Llh/j0;

    .line 88
    .line 89
    .line 90
    new-instance v4, Lbh/h;

    .line 91
    .line 92
    invoke-direct {v4, v3, v2, v5}, Lbh/h;-><init>(Lug/x;Lah/e;Ltc/b0;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    new-instance v2, Lb5/d0;

    .line 96
    .line 97
    invoke-direct {v2, v0, v1, v4}, Lb5/d0;-><init>(Lzg/n;Lzg/h;Lah/f;)V

    .line 98
    .line 99
    .line 100
    iput-object v2, v0, Lzg/n;->j:Lb5/d0;

    .line 101
    .line 102
    iput-object v2, v0, Lzg/n;->q:Lb5/d0;

    .line 103
    .line 104
    monitor-enter v0

    .line 105
    const/4 v1, 0x1

    .line 106
    :try_start_1
    iput-boolean v1, v0, Lzg/n;->k:Z

    .line 107
    .line 108
    iput-boolean v1, v0, Lzg/n;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    monitor-exit v0

    .line 111
    iget-boolean v0, v0, Lzg/n;->p:Z

    .line 112
    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    const/16 v1, 0x3d

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-static {p1, v3, v2, v0, v1}, Lah/h;->a(Lah/h;ILb5/d0;Lb7/b1;I)Lah/h;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object p1, p1, Lah/h;->e:Lb7/b1;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 131
    .line 132
    const-string v0, "Canceled"

    .line 133
    .line 134
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :catchall_0
    move-exception p1

    .line 139
    monitor-exit v0

    .line 140
    throw p1

    .line 141
    :catchall_1
    move-exception p1

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v1, "Check failed."

    .line 146
    .line 147
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_3
    const-string p1, "released"

    .line 152
    .line 153
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 159
    :goto_1
    monitor-exit v0

    .line 160
    throw p1
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
