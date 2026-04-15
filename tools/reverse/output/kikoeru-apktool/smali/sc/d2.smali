.class public abstract Lsc/d2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lbe/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbe/c;

    .line 2
    .line 3
    const-string v1, "java.lang.Void"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbe/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lbe/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbe/c;->b()Lbe/c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v0, v0, Lbe/c;->a:Lbe/d;

    .line 15
    .line 16
    invoke-virtual {v0}, Lbe/d;->g()Lbe/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v1, v2, v0}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lsc/d2;->a:Lbe/b;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static a(Lyc/t;)Lsc/m;
    .locals 4

    .line 1
    new-instance v0, Lsc/m;

    .line 2
    .line 3
    new-instance v1, Lae/e;

    .line 4
    .line 5
    invoke-static {p0}, Lg8/a;->G(Lyc/t;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    instance-of v2, p0, Lbd/q0;

    .line 12
    .line 13
    const-string v3, "asString(...)"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lie/d;->k(Lyc/c;)Lyc/c;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lyc/k;->getName()Lbe/e;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lbe/e;->b()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lld/v;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    instance-of v2, p0, Lbd/r0;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-static {p0}, Lie/d;->k(Lyc/c;)Lyc/c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Lyc/k;->getName()Lbe/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lbe/e;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lld/v;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v2, p0

    .line 62
    check-cast v2, Lbd/p;

    .line 63
    .line 64
    invoke-virtual {v2}, Lbd/p;->getName()Lbe/e;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lbe/e;->b()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 76
    invoke-static {p0, v3}, Lua/l;->J(Lyc/t;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v1, v2, p0}, Lae/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, Lsc/m;-><init>(Lae/e;)V

    .line 84
    .line 85
    .line 86
    return-object v0
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
.end method

.method public static b(Lyc/k0;)Ln7/e;
    .locals 6

    .line 1
    const-string v0, "possiblyOverriddenProperty"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lee/e;->s(Lyc/c;)Lyc/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lyc/k0;

    .line 11
    .line 12
    invoke-interface {p0}, Lyc/k0;->a()Lyc/k0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string p0, "getOriginal(...)"

    .line 17
    .line 18
    invoke-static {v1, p0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of p0, v1, Lqe/q;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    move-object p0, v1

    .line 27
    check-cast p0, Lqe/q;

    .line 28
    .line 29
    iget-object v2, p0, Lqe/q;->A:Lwd/j0;

    .line 30
    .line 31
    sget-object v3, Lzd/j;->d:Lce/o;

    .line 32
    .line 33
    const-string v4, "propertySignature"

    .line 34
    .line 35
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, Lvb/w;->m(Lce/m;Lce/o;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lzd/d;

    .line 43
    .line 44
    if-eqz v3, :cond_a

    .line 45
    .line 46
    new-instance v0, Lsc/p;

    .line 47
    .line 48
    iget-object v4, p0, Lqe/q;->B:Lyd/f;

    .line 49
    .line 50
    iget-object v5, p0, Lqe/q;->C:Lbd/f0;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v5}, Lsc/p;-><init>(Lyc/k0;Lwd/j0;Lzd/d;Lyd/f;Lbd/f0;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_0
    instance-of p0, v1, Lnd/f;

    .line 57
    .line 58
    if-eqz p0, :cond_a

    .line 59
    .line 60
    move-object p0, v1

    .line 61
    check-cast p0, Lnd/f;

    .line 62
    .line 63
    invoke-virtual {p0}, Lbd/q;->m()Lyc/m0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    instance-of v3, v2, Ldd/g;

    .line 68
    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    check-cast v2, Ldd/g;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move-object v2, v0

    .line 75
    :goto_0
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v2, v2, Ldd/g;->a:Led/s;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move-object v2, v0

    .line 81
    :goto_1
    instance-of v3, v2, Led/u;

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    new-instance p0, Lsc/n;

    .line 86
    .line 87
    check-cast v2, Led/u;

    .line 88
    .line 89
    iget-object v0, v2, Led/u;->a:Ljava/lang/reflect/Field;

    .line 90
    .line 91
    invoke-direct {p0, v0}, Lsc/n;-><init>(Ljava/lang/reflect/Field;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_3
    instance-of v3, v2, Led/x;

    .line 96
    .line 97
    if-eqz v3, :cond_9

    .line 98
    .line 99
    new-instance v1, Lsc/o;

    .line 100
    .line 101
    check-cast v2, Led/x;

    .line 102
    .line 103
    iget-object v2, v2, Led/x;->a:Ljava/lang/reflect/Method;

    .line 104
    .line 105
    iget-object p0, p0, Lbd/p0;->x:Lbd/r0;

    .line 106
    .line 107
    if-eqz p0, :cond_4

    .line 108
    .line 109
    check-cast p0, Lbd/q;

    .line 110
    .line 111
    invoke-virtual {p0}, Lbd/q;->m()Lyc/m0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move-object p0, v0

    .line 117
    :goto_2
    instance-of v3, p0, Ldd/g;

    .line 118
    .line 119
    if-eqz v3, :cond_5

    .line 120
    .line 121
    check-cast p0, Ldd/g;

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    move-object p0, v0

    .line 125
    :goto_3
    if-eqz p0, :cond_6

    .line 126
    .line 127
    iget-object p0, p0, Ldd/g;->a:Led/s;

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    move-object p0, v0

    .line 131
    :goto_4
    instance-of v3, p0, Led/x;

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    check-cast p0, Led/x;

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    move-object p0, v0

    .line 139
    :goto_5
    if-eqz p0, :cond_8

    .line 140
    .line 141
    iget-object v0, p0, Led/x;->a:Ljava/lang/reflect/Method;

    .line 142
    .line 143
    :cond_8
    invoke-direct {v1, v2, v0}, Lsc/o;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_9
    new-instance p0, Lhc/a;

    .line 148
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v3, "Incorrect resolution sequence for Java field "

    .line 152
    .line 153
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v1, " (source = "

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const/16 v1, 0x29

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-direct {p0, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_a
    invoke-interface {v1}, Lyc/k0;->d()Lbd/q0;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-static {p0}, Lsc/d2;->a(Lyc/t;)Lsc/m;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-interface {v1}, Lyc/k0;->e()Lbd/r0;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-eqz v1, :cond_b

    .line 196
    .line 197
    invoke-static {v1}, Lsc/d2;->a(Lyc/t;)Lsc/m;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :cond_b
    new-instance v1, Lsc/q;

    .line 202
    .line 203
    invoke-direct {v1, p0, v0}, Lsc/q;-><init>(Lsc/m;Lsc/m;)V

    .line 204
    .line 205
    .line 206
    return-object v1
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

.method public static c(Lyc/t;)Ln7/d;
    .locals 8

    .line 1
    const-string v0, "possiblySubstitutedFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lee/e;->s(Lyc/c;)Lyc/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lyc/t;

    .line 11
    .line 12
    invoke-interface {v0}, Lyc/t;->a()Lyc/t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getOriginal(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of v1, v0, Lqe/b;

    .line 22
    .line 23
    if-eqz v1, :cond_9

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Lqe/k;

    .line 27
    .line 28
    invoke-interface {v1}, Lqe/k;->X()Lce/b;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    instance-of v3, v2, Lwd/b0;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    sget-object v3, Lae/g;->a:Lce/i;

    .line 37
    .line 38
    move-object v3, v2

    .line 39
    check-cast v3, Lwd/b0;

    .line 40
    .line 41
    invoke-interface {v1}, Lqe/k;->p0()Lyd/f;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {v1}, Lqe/k;->l0()Lbd/f0;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v3, v4, v5}, Lae/g;->c(Lwd/b0;Lyd/f;Lbd/f0;)Lae/e;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    new-instance p0, Lsc/m;

    .line 56
    .line 57
    invoke-direct {p0, v3}, Lsc/m;-><init>(Lae/e;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_0
    instance-of v3, v2, Lwd/n;

    .line 62
    .line 63
    if-eqz v3, :cond_8

    .line 64
    .line 65
    sget-object v3, Lae/g;->a:Lce/i;

    .line 66
    .line 67
    check-cast v2, Lwd/n;

    .line 68
    .line 69
    invoke-interface {v1}, Lqe/k;->p0()Lyd/f;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v1}, Lqe/k;->l0()Lbd/f0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v2, v3, v1}, Lae/g;->a(Lwd/n;Lyd/f;Lbd/f0;)Lae/e;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_8

    .line 82
    .line 83
    iget-object v0, v1, Lae/e;->e:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, v1, Lae/e;->f:Ljava/lang/String;

    .line 86
    .line 87
    invoke-interface {p0}, Lyc/k;->y()Lyc/k;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const-string v4, "getContainingDeclaration(...)"

    .line 92
    .line 93
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Lee/g;->b(Lyc/k;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    new-instance p0, Lsc/m;

    .line 103
    .line 104
    invoke-direct {p0, v1}, Lsc/m;-><init>(Lae/e;)V

    .line 105
    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_1
    invoke-interface {p0}, Lyc/k;->y()Lyc/k;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, Lee/g;->c(Lyc/k;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_7

    .line 120
    .line 121
    check-cast p0, Lyc/j;

    .line 122
    .line 123
    invoke-interface {p0}, Lyc/j;->U()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const/4 v4, 0x0

    .line 128
    const-string v5, ")V"

    .line 129
    .line 130
    const-string v6, "constructor-impl"

    .line 131
    .line 132
    const-string v7, "Invalid signature: "

    .line 133
    .line 134
    if-eqz v3, :cond_3

    .line 135
    .line 136
    invoke-static {v0, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_2

    .line 141
    .line 142
    invoke-static {v2, v5, v4}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_2

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {p0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_3
    invoke-static {v0, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    invoke-interface {p0}, Lyc/j;->V()Lyc/e;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    const-string v3, "getConstructedClass(...)"

    .line 182
    .line 183
    invoke-static {p0, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p0}, Lie/d;->f(Lyc/h;)Lbe/b;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lbe/b;->b()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-static {p0}, Lae/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {v2, v5, v4}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_4

    .line 206
    .line 207
    new-instance v1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v3, "V"

    .line 213
    .line 214
    invoke-static {v2, v3}, Lef/n;->G0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    const-string v1, "name"

    .line 229
    .line 230
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const-string v1, "desc"

    .line 234
    .line 235
    invoke-static {p0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, Lae/e;

    .line 239
    .line 240
    invoke-direct {v1, v0, p0}, Lae/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_4
    invoke-static {v2, p0, v4}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    if-eqz p0, :cond_5

    .line 249
    .line 250
    :goto_0
    new-instance p0, Lsc/m;

    .line 251
    .line 252
    invoke-direct {p0, v1}, Lsc/m;-><init>(Lae/e;)V

    .line 253
    .line 254
    .line 255
    return-object p0

    .line 256
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {p0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 269
    .line 270
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {p0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 291
    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :cond_7
    new-instance p0, Lsc/l;

    .line 301
    .line 302
    invoke-direct {p0, v1}, Lsc/l;-><init>(Lae/e;)V

    .line 303
    .line 304
    .line 305
    return-object p0

    .line 306
    :cond_8
    invoke-static {v0}, Lsc/d2;->a(Lyc/t;)Lsc/m;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :cond_9
    instance-of p0, v0, Lnd/e;

    .line 312
    .line 313
    const/4 v1, 0x0

    .line 314
    if-eqz p0, :cond_e

    .line 315
    .line 316
    move-object p0, v0

    .line 317
    check-cast p0, Lnd/e;

    .line 318
    .line 319
    invoke-virtual {p0}, Lbd/q;->m()Lyc/m0;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    instance-of v2, p0, Ldd/g;

    .line 324
    .line 325
    if-eqz v2, :cond_a

    .line 326
    .line 327
    check-cast p0, Ldd/g;

    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_a
    move-object p0, v1

    .line 331
    :goto_1
    if-eqz p0, :cond_b

    .line 332
    .line 333
    iget-object p0, p0, Ldd/g;->a:Led/s;

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_b
    move-object p0, v1

    .line 337
    :goto_2
    instance-of v2, p0, Led/x;

    .line 338
    .line 339
    if-eqz v2, :cond_c

    .line 340
    .line 341
    move-object v1, p0

    .line 342
    check-cast v1, Led/x;

    .line 343
    .line 344
    :cond_c
    if-eqz v1, :cond_d

    .line 345
    .line 346
    iget-object p0, v1, Led/x;->a:Ljava/lang/reflect/Method;

    .line 347
    .line 348
    if-eqz p0, :cond_d

    .line 349
    .line 350
    new-instance v0, Lsc/k;

    .line 351
    .line 352
    invoke-direct {v0, p0}, Lsc/k;-><init>(Ljava/lang/reflect/Method;)V

    .line 353
    .line 354
    .line 355
    return-object v0

    .line 356
    :cond_d
    new-instance p0, Lhc/a;

    .line 357
    .line 358
    new-instance v1, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v2, "Incorrect resolution sequence for Java method "

    .line 361
    .line 362
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-direct {p0, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw p0

    .line 376
    :cond_e
    instance-of p0, v0, Lnd/b;

    .line 377
    .line 378
    const/16 v2, 0x29

    .line 379
    .line 380
    const-string v3, " ("

    .line 381
    .line 382
    if-eqz p0, :cond_13

    .line 383
    .line 384
    move-object p0, v0

    .line 385
    check-cast p0, Lnd/b;

    .line 386
    .line 387
    invoke-virtual {p0}, Lbd/q;->m()Lyc/m0;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    instance-of v4, p0, Ldd/g;

    .line 392
    .line 393
    if-eqz v4, :cond_f

    .line 394
    .line 395
    check-cast p0, Ldd/g;

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_f
    move-object p0, v1

    .line 399
    :goto_3
    if-eqz p0, :cond_10

    .line 400
    .line 401
    iget-object v1, p0, Ldd/g;->a:Led/s;

    .line 402
    .line 403
    :cond_10
    instance-of p0, v1, Led/r;

    .line 404
    .line 405
    if-eqz p0, :cond_11

    .line 406
    .line 407
    new-instance p0, Lsc/j;

    .line 408
    .line 409
    check-cast v1, Led/r;

    .line 410
    .line 411
    iget-object v0, v1, Led/r;->a:Ljava/lang/reflect/Constructor;

    .line 412
    .line 413
    invoke-direct {p0, v0}, Lsc/j;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 414
    .line 415
    .line 416
    return-object p0

    .line 417
    :cond_11
    instance-of p0, v1, Led/o;

    .line 418
    .line 419
    if-eqz p0, :cond_12

    .line 420
    .line 421
    move-object p0, v1

    .line 422
    check-cast p0, Led/o;

    .line 423
    .line 424
    iget-object p0, p0, Led/o;->a:Ljava/lang/Class;

    .line 425
    .line 426
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_12

    .line 431
    .line 432
    new-instance v0, Lsc/i;

    .line 433
    .line 434
    invoke-direct {v0, p0}, Lsc/i;-><init>(Ljava/lang/Class;)V

    .line 435
    .line 436
    .line 437
    return-object v0

    .line 438
    :cond_12
    new-instance p0, Lhc/a;

    .line 439
    .line 440
    new-instance v4, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    const-string v5, "Incorrect resolution sequence for Java constructor "

    .line 443
    .line 444
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-direct {p0, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw p0

    .line 467
    :cond_13
    move-object p0, v0

    .line 468
    check-cast p0, Lbd/p;

    .line 469
    .line 470
    invoke-virtual {p0}, Lbd/p;->getName()Lbe/e;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    sget-object v4, Lvc/o;->c:Lbe/e;

    .line 475
    .line 476
    invoke-virtual {v1, v4}, Lbe/e;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_14

    .line 481
    .line 482
    invoke-static {v0}, Lee/m;->n(Lyc/t;)Z

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    if-eqz v1, :cond_14

    .line 487
    .line 488
    goto :goto_4

    .line 489
    :cond_14
    invoke-virtual {p0}, Lbd/p;->getName()Lbe/e;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    sget-object v4, Lvc/o;->a:Lbe/e;

    .line 494
    .line 495
    invoke-virtual {v1, v4}, Lbe/e;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    if-eqz v1, :cond_15

    .line 500
    .line 501
    invoke-static {v0}, Lee/m;->n(Lyc/t;)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_15

    .line 506
    .line 507
    goto :goto_4

    .line 508
    :cond_15
    invoke-virtual {p0}, Lbd/p;->getName()Lbe/e;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    sget-object v1, Lxc/a;->e:Lbe/e;

    .line 513
    .line 514
    invoke-static {p0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result p0

    .line 518
    if-eqz p0, :cond_16

    .line 519
    .line 520
    invoke-interface {v0}, Lyc/b;->o0()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result p0

    .line 528
    if-eqz p0, :cond_16

    .line 529
    .line 530
    :goto_4
    invoke-static {v0}, Lsc/d2;->a(Lyc/t;)Lsc/m;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    return-object p0

    .line 535
    :cond_16
    new-instance p0, Lhc/a;

    .line 536
    .line 537
    new-instance v1, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    const-string v4, "Unknown origin of "

    .line 540
    .line 541
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-direct {p0, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    throw p0
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
