.class public final synthetic Lb7/f1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/h1;
.implements Lb7/b2;


# instance fields
.field public final synthetic a:Lm4/u0;


# direct methods
.method public synthetic constructor <init>(Lm4/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/f1;->a:Lm4/u0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public b(Lb7/s1;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f1;->a:Lm4/u0;

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lb7/s1;->f(ILm4/u0;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public c(Lb7/t0;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lb7/t0;->a:Lb7/d0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb7/t0;->T()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v1, p1, Lb7/t0;->u:Lm4/u0;

    .line 12
    .line 13
    sget v2, Lp4/c0;->a:I

    .line 14
    .line 15
    iget-object v2, p0, Lb7/f1;->a:Lm4/u0;

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    iput-object v2, p1, Lb7/t0;->u:Lm4/u0;

    .line 26
    .line 27
    iget-object v1, p1, Lb7/t0;->v:Lm4/u0;

    .line 28
    .line 29
    iget-object v3, p1, Lb7/t0;->t:Lm4/u0;

    .line 30
    .line 31
    invoke-static {v3, v2}, Lb7/t0;->b(Lm4/u0;Lm4/u0;)Lm4/u0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, p1, Lb7/t0;->v:Lm4/u0;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lm4/u0;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    iget-object v1, p1, Lb7/t0;->q:Lya/a1;

    .line 46
    .line 47
    iget-object v4, p1, Lb7/t0;->r:Lya/a1;

    .line 48
    .line 49
    iget-object v5, p1, Lb7/t0;->p:Lya/i0;

    .line 50
    .line 51
    iget-object v6, p1, Lb7/t0;->o:Lya/i0;

    .line 52
    .line 53
    iget-object v7, p1, Lb7/t0;->s:Lb7/f4;

    .line 54
    .line 55
    iget-object v8, p1, Lb7/t0;->v:Lm4/u0;

    .line 56
    .line 57
    iget-object v9, p1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-static {v5, v6, v7, v8, v9}, Lb7/t0;->n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iput-object v5, p1, Lb7/t0;->q:Lya/a1;

    .line 64
    .line 65
    iget-object v6, p1, Lb7/t0;->o:Lya/i0;

    .line 66
    .line 67
    iget-object v7, p1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 68
    .line 69
    iget-object v8, p1, Lb7/t0;->s:Lb7/f4;

    .line 70
    .line 71
    iget-object v9, p1, Lb7/t0;->v:Lm4/u0;

    .line 72
    .line 73
    invoke-static {v5, v6, v7, v8, v9}, Lb7/t0;->m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iput-object v5, p1, Lb7/t0;->r:Lya/a1;

    .line 78
    .line 79
    iget-object v5, p1, Lb7/t0;->q:Lya/a1;

    .line 80
    .line 81
    invoke-virtual {v5, v1}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    xor-int/2addr v1, v2

    .line 86
    iget-object v5, p1, Lb7/t0;->r:Lya/a1;

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    xor-int/2addr v4, v2

    .line 93
    iget-object v5, p1, Lb7/t0;->h:Lp4/n;

    .line 94
    .line 95
    new-instance v6, Lb7/l0;

    .line 96
    .line 97
    const/4 v7, 0x2

    .line 98
    invoke-direct {v6, p1, v7}, Lb7/l0;-><init>(Lb7/t0;I)V

    .line 99
    .line 100
    .line 101
    const/16 p1, 0xd

    .line 102
    .line 103
    invoke-virtual {v5, p1, v6}, Lp4/n;->e(ILp4/k;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    const/4 v1, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    :goto_0
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget-object v4, v0, Lb7/d0;->d:Landroid/os/Handler;

    .line 119
    .line 120
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne p1, v4, :cond_3

    .line 125
    .line 126
    const/4 p1, 0x1

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const/4 p1, 0x0

    .line 129
    :goto_1
    invoke-static {p1}, Lp4/c;->i(Z)V

    .line 130
    .line 131
    .line 132
    iget-object p1, v0, Lb7/d0;->c:Lb7/b0;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :cond_4
    if-eqz v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget-object v1, v0, Lb7/d0;->d:Landroid/os/Handler;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-ne p1, v1, :cond_5

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    const/4 v2, 0x0

    .line 156
    :goto_2
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 157
    .line 158
    .line 159
    iget-object p1, v0, Lb7/d0;->c:Lb7/b0;

    .line 160
    .line 161
    invoke-interface {p1}, Lb7/b0;->w()V

    .line 162
    .line 163
    .line 164
    :cond_6
    :goto_3
    return-void
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
