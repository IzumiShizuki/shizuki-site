.class public Lsc/b2;
.super Ljc/a0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static k(Ljc/d;)Lsc/i0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljc/d;->i()Lpc/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lsc/i0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lsc/i0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lsc/f;->b:Lsc/f;

    .line 13
    .line 14
    return-object p0
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
.method public final a(Ljc/j;)Lpc/f;
    .locals 6

    .line 1
    new-instance v0, Lsc/k0;

    .line 2
    .line 3
    invoke-static {p1}, Lsc/b2;->k(Ljc/d;)Lsc/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljc/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ljc/d;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p1, Ljc/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    const-string p1, "name"

    .line 14
    .line 15
    invoke-static {v2, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "signature"

    .line 19
    .line 20
    invoke-static {v3, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct/range {v0 .. v5}, Lsc/k0;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Lyc/t;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
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

.method public final b(Ljava/lang/Class;)Lpc/c;
    .locals 0

    .line 1
    invoke-static {p1}, Lsc/d;->a(Ljava/lang/Class;)Lsc/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final c(Ljava/lang/Class;)Lpc/e;
    .locals 1

    .line 1
    sget-object v0, Lsc/d;->a:Lsc/e;

    .line 2
    .line 3
    const-string v0, "jClass"

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lsc/d;->b:Lsc/e;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lsc/e;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lpc/e;

    .line 15
    .line 16
    return-object p1
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

.method public final d(Ljc/n;)Lpc/i;
    .locals 4

    .line 1
    new-instance v0, Lsc/m0;

    .line 2
    .line 3
    invoke-static {p1}, Lsc/b2;->k(Ljc/d;)Lsc/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljc/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ljc/d;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Ljc/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, Lsc/m0;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final e(Ljc/o;)Lpc/k;
    .locals 4

    .line 1
    new-instance v0, Lsc/o0;

    .line 2
    .line 3
    invoke-static {p1}, Lsc/b2;->k(Ljc/d;)Lsc/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljc/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ljc/d;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Ljc/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, Lsc/o0;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final f(Ljc/r;)Lpc/r;
    .locals 4

    .line 1
    new-instance v0, Lsc/d1;

    .line 2
    .line 3
    invoke-static {p1}, Lsc/b2;->k(Ljc/d;)Lsc/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljc/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ljc/d;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Ljc/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, Lsc/d1;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final g(Ljc/s;)Lpc/t;
    .locals 4

    .line 1
    new-instance v0, Lsc/g1;

    .line 2
    .line 3
    invoke-static {p1}, Lsc/b2;->k(Ljc/d;)Lsc/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljc/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ljc/d;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Ljc/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, Lsc/g1;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final h(Ljc/i;)Ljava/lang/String;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lkotlin/Metadata;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlin/Metadata;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v4, v3

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-interface {v0}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    array-length v5, v4

    .line 25
    if-nez v5, :cond_1

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    :cond_1
    if-nez v4, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-interface {v0}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, Lae/g;->a:Lce/i;

    .line 36
    .line 37
    const-string v6, "strings"

    .line 38
    .line 39
    invoke-static {v5, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v6, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-static {v4}, Lae/a;->a([Ljava/lang/String;)[B

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-direct {v6, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 49
    .line 50
    .line 51
    sget-object v4, Lae/g;->a:Lce/i;

    .line 52
    .line 53
    invoke-static {v6, v5}, Lae/g;->g(Ljava/io/ByteArrayInputStream;[Ljava/lang/String;)Lae/f;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    sget-object v4, Lae/g;->a:Lce/i;

    .line 58
    .line 59
    sget-object v5, Lwd/b0;->z:Lwd/a;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v7, Lce/f;

    .line 65
    .line 66
    invoke-direct {v7, v6}, Lce/f;-><init>(Ljava/io/InputStream;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v5, v7, v4}, Lce/y;->a(Lce/f;Lce/i;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lce/b;

    .line 74
    .line 75
    :try_start_0
    invoke-virtual {v7, v1}, Lce/f;->a(I)V
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Lce/c;->b(Lce/b;)V

    .line 79
    .line 80
    .line 81
    move-object v8, v4

    .line 82
    check-cast v8, Lwd/b0;

    .line 83
    .line 84
    new-instance v11, Lyd/e;

    .line 85
    .line 86
    invoke-interface {v0}, Lkotlin/Metadata;->mv()[I

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-interface {v0}, Lkotlin/Metadata;->xi()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    and-int/lit8 v0, v0, 0x8

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const/4 v0, 0x0

    .line 101
    :goto_1
    invoke-direct {v11, v4, v0}, Lyd/e;-><init>([IZ)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    new-instance v10, Lbd/f0;

    .line 109
    .line 110
    iget-object v0, v8, Lwd/b0;->q:Lwd/z0;

    .line 111
    .line 112
    const-string v4, "getTypeTable(...)"

    .line 113
    .line 114
    invoke-static {v0, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v10, v0}, Lbd/f0;-><init>(Lwd/z0;)V

    .line 118
    .line 119
    .line 120
    sget-object v12, Lrc/a;->i:Lrc/a;

    .line 121
    .line 122
    invoke-static/range {v7 .. v12}, Lsc/f2;->f(Ljava/lang/Class;Lce/m;Lyd/f;Lbd/f0;Lyd/a;Lic/n;)Lyc/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lbd/s0;

    .line 127
    .line 128
    new-instance v4, Lsc/k0;

    .line 129
    .line 130
    sget-object v5, Lsc/f;->b:Lsc/f;

    .line 131
    .line 132
    invoke-direct {v4, v5, v0}, Lsc/k0;-><init>(Lsc/i0;Lyc/t;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    if-eqz v4, :cond_9

    .line 136
    .line 137
    invoke-static {v4}, Lsc/f2;->b(Ljava/lang/Object;)Lsc/k0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    new-instance v5, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lsc/u;->o()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Ljava/lang/Iterable;

    .line 153
    .line 154
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    move-object v4, v3

    .line 159
    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_6

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    move-object v7, v6

    .line 170
    check-cast v7, Lpc/n;

    .line 171
    .line 172
    check-cast v7, Lsc/a1;

    .line 173
    .line 174
    iget-object v7, v7, Lsc/a1;->c:Lpc/m;

    .line 175
    .line 176
    sget-object v8, Lpc/m;->c:Lpc/m;

    .line 177
    .line 178
    if-ne v7, v8, :cond_4

    .line 179
    .line 180
    if-eqz v1, :cond_5

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_5
    move-object v4, v6

    .line 184
    const/4 v1, 0x1

    .line 185
    goto :goto_3

    .line 186
    :cond_6
    if-nez v1, :cond_7

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    move-object v3, v4

    .line 190
    :goto_4
    check-cast v3, Lpc/n;

    .line 191
    .line 192
    if-eqz v3, :cond_8

    .line 193
    .line 194
    check-cast v3, Lsc/a1;

    .line 195
    .line 196
    invoke-virtual {v3}, Lsc/a1;->c()Lsc/v1;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-static {p1}, Lnh/a;->A(Lpc/v;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string p1, "."

    .line 208
    .line 209
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    :cond_8
    invoke-static {v0}, Lnh/b;->y(Lpc/f;)Ljava/util/ArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    sget-object v9, Lsc/c;->m:Lsc/c;

    .line 217
    .line 218
    const/16 v10, 0x30

    .line 219
    .line 220
    const-string v6, ", "

    .line 221
    .line 222
    const-string v7, "("

    .line 223
    .line 224
    const-string v8, ")"

    .line 225
    .line 226
    invoke-static/range {v4 .. v10}, Lvb/m;->e0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)V

    .line 227
    .line 228
    .line 229
    const-string p1, " -> "

    .line 230
    .line 231
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Lsc/u;->n()Lpc/v;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {p1}, Lnh/a;->A(Lpc/v;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    return-object p1

    .line 250
    :cond_9
    invoke-super {p0, p1}, Ljc/a0;->h(Ljc/i;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1

    .line 255
    :catch_0
    move-exception v0

    .line 256
    move-object p1, v0

    .line 257
    iput-object v4, p1, Lce/s;->a:Lce/b;

    .line 258
    .line 259
    throw p1
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

.method public final i(Ljc/m;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lsc/b2;->h(Ljc/i;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final j(Lpc/c;Ljava/util/List;)Lpc/v;
    .locals 4

    .line 1
    instance-of v0, p1, Ljc/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, Ljc/e;

    .line 7
    .line 8
    invoke-interface {p1}, Ljc/e;->b()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lsc/d;->a:Lsc/e;

    .line 13
    .line 14
    const-string v0, "jClass"

    .line 15
    .line 16
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "arguments"

    .line 20
    .line 21
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object p2, Lsc/d;->c:Lsc/e;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lsc/e;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lpc/v;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    sget-object v0, Lsc/d;->d:Lsc/e;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lsc/e;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    new-instance v3, Lub/k;

    .line 50
    .line 51
    invoke-direct {v3, p2, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    invoke-static {p1}, Lsc/d;->a(Ljava/lang/Class;)Lsc/d0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v2, Lvb/r;->a:Lvb/r;

    .line 65
    .line 66
    invoke-static {p1, p2, v1, v2}, Ln7/d;->l(Lpc/d;Ljava/util/List;ZLjava/util/List;)Lsc/v1;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {v0, v3, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-nez p2, :cond_1

    .line 75
    .line 76
    move-object v2, p1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v2, p2

    .line 79
    :cond_2
    :goto_0
    check-cast v2, Lpc/v;

    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {p1, p2, v1, v0}, Ln7/d;->l(Lpc/d;Ljava/util/List;ZLjava/util/List;)Lsc/v1;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
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
