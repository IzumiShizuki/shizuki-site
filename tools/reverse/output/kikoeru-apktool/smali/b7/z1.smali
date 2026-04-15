.class public final Lb7/z1;
.super Landroid/os/Handler;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Z

.field public b:Z

.field public final synthetic c:Lb7/c2;


# direct methods
.method public constructor <init>(Lb7/c2;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/z1;->c:Lb7/c2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lb7/z1;->a:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lb7/z1;->b:Z

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final a(ZZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lb7/z1;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iput-boolean p1, p0, Lb7/z1;->a:Z

    .line 13
    .line 14
    iget-boolean p1, p0, Lb7/z1;->b:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :cond_1
    iput-boolean v1, p0, Lb7/z1;->b:Z

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
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

.method public final handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 1
    iget-object v1, p0, Lb7/z1;->c:Lb7/c2;

    .line 2
    .line 3
    iget-object v2, v1, Lb7/c2;->g:Lb7/q3;

    .line 4
    .line 5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v3, :cond_5

    .line 9
    .line 10
    iget-object p1, v1, Lb7/c2;->s:Lb7/v3;

    .line 11
    .line 12
    iget-object v0, v1, Lb7/c2;->t:Lb7/z3;

    .line 13
    .line 14
    invoke-virtual {v0}, Lb7/z3;->y()Lm4/i1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v4, v1, Lb7/c2;->t:Lb7/z3;

    .line 19
    .line 20
    invoke-virtual {v4}, Lb7/z3;->g()Lb7/h4;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v1, Lb7/c2;->s:Lb7/v3;

    .line 25
    .line 26
    iget v5, v5, Lb7/v3;->k:I

    .line 27
    .line 28
    invoke-virtual {p1, v0, v4, v5}, Lb7/v3;->g(Lm4/i1;Lb7/h4;I)Lb7/v3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, v1, Lb7/c2;->s:Lb7/v3;

    .line 33
    .line 34
    iget-boolean v8, p0, Lb7/z1;->a:Z

    .line 35
    .line 36
    iget-boolean v9, p0, Lb7/z1;->b:Z

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lb7/q3;->C0(Lb7/v3;)Lb7/v3;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object p1, v2, Lb7/q3;->g:Lb0/w1;

    .line 43
    .line 44
    invoke-virtual {p1}, Lb0/w1;->L()Lya/i0;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v12, 0x0

    .line 50
    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ge v12, v0, :cond_4

    .line 55
    .line 56
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v13, v0

    .line 61
    check-cast v13, Lb7/t1;

    .line 62
    .line 63
    :try_start_0
    invoke-virtual {p1, v13}, Lb0/w1;->O(Lb7/t1;)Lb7/d4;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0}, Lb7/d4;->j()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    move v5, v0

    .line 74
    goto :goto_3

    .line 75
    :catch_0
    move-exception v0

    .line 76
    goto :goto_4

    .line 77
    :cond_0
    iget-object v0, v2, Lb7/q3;->g:Lb0/w1;

    .line 78
    .line 79
    invoke-virtual {v0, v13}, Lb0/w1;->S(Lb7/t1;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    iget-object v0, v1, Lb7/c2;->h:Lb7/o2;

    .line 86
    .line 87
    iget-object v0, v0, Lb7/o2;->f:Lb0/w1;

    .line 88
    .line 89
    invoke-virtual {v0, v13}, Lb0/w1;->S(Lb7/t1;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    const/4 v0, 0x0

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 99
    :goto_2
    if-nez v0, :cond_3

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_3
    const/4 v5, 0x0

    .line 103
    :goto_3
    invoke-virtual {p1, v13}, Lb0/w1;->G(Lb7/t1;)Lm4/u0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v4, v1, Lb7/c2;->t:Lb7/z3;

    .line 108
    .line 109
    invoke-virtual {v4}, Lb7/z3;->m()Lm4/u0;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v0, v4}, Lb7/s3;->g(Lm4/u0;Lm4/u0;)Lm4/u0;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    iget-object v4, v13, Lb7/t1;->d:Lb7/s1;

    .line 118
    .line 119
    invoke-static {v4}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-interface/range {v4 .. v9}, Lb7/s1;->c(ILb7/v3;Lm4/u0;ZZ)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v5, "Exception in "

    .line 129
    .line 130
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13}, Lb7/t1;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    const-string v5, "MediaSessionImpl"

    .line 145
    .line 146
    invoke-static {v5, v4, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :catch_1
    iget-object v0, v2, Lb7/q3;->g:Lb0/w1;

    .line 151
    .line 152
    invoke-virtual {v0, v13}, Lb0/w1;->a0(Lb7/t1;)V

    .line 153
    .line 154
    .line 155
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_4
    :goto_6
    iput-boolean v3, p0, Lb7/z1;->a:Z

    .line 159
    .line 160
    iput-boolean v3, p0, Lb7/z1;->b:Z

    .line 161
    .line 162
    return-void

    .line 163
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v2, "Invalid message what="

    .line 168
    .line 169
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget p1, p1, Landroid/os/Message;->what:I

    .line 173
    .line 174
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
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
