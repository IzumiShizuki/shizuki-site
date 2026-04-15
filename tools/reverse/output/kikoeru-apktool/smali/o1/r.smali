.class public final Lo1/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final b:Lo1/r;

.field public static final c:Lo1/r;

.field public static final d:Lo1/r;


# instance fields
.field public final a:Lz0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo1/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lo1/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo1/r;->b:Lo1/r;

    .line 7
    .line 8
    new-instance v0, Lo1/r;

    .line 9
    .line 10
    invoke-direct {v0}, Lo1/r;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lo1/r;->c:Lo1/r;

    .line 14
    .line 15
    new-instance v0, Lo1/r;

    .line 16
    .line 17
    invoke-direct {v0}, Lo1/r;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lo1/r;->d:Lo1/r;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz0/e;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lo1/s;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lo1/r;->a:Lz0/e;

    .line 14
    .line 15
    return-void
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

.method public static b(Lo1/r;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo1/m;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v0, v1, v2}, Lo1/m;-><init>(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lo1/r;->a(Lic/k;)Z

    .line 12
    .line 13
    .line 14
    return-void
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
.method public final a(Lic/k;)Z
    .locals 14

    .line 1
    sget-object v0, Lo1/r;->b:Lo1/r;

    .line 2
    .line 3
    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 4
    .line 5
    if-eq p0, v0, :cond_13

    .line 6
    .line 7
    sget-object v0, Lo1/r;->c:Lo1/r;

    .line 8
    .line 9
    if-eq p0, v0, :cond_12

    .line 10
    .line 11
    iget-object v0, p0, Lo1/r;->a:Lz0/e;

    .line 12
    .line 13
    iget v1, v0, Lz0/e;->c:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string p1, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 19
    .line 20
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    iget-object v0, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_0
    if-ge v3, v1, :cond_11

    .line 31
    .line 32
    aget-object v5, v0, v3

    .line 33
    .line 34
    check-cast v5, Lo1/s;

    .line 35
    .line 36
    check-cast v5, Lj1/p;

    .line 37
    .line 38
    iget-object v6, v5, Lj1/p;->a:Lj1/p;

    .line 39
    .line 40
    iget-boolean v6, v6, Lj1/p;->n:Z

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    const-string v6, "visitChildren called on an unattached node"

    .line 45
    .line 46
    invoke-static {v6}, Lf2/a;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    new-instance v6, Lz0/e;

    .line 50
    .line 51
    const/16 v7, 0x10

    .line 52
    .line 53
    new-array v8, v7, [Lj1/p;

    .line 54
    .line 55
    invoke-direct {v6, v8}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v5, v5, Lj1/p;->a:Lj1/p;

    .line 59
    .line 60
    iget-object v8, v5, Lj1/p;->f:Lj1/p;

    .line 61
    .line 62
    if-nez v8, :cond_2

    .line 63
    .line 64
    invoke-static {v6, v5}, Li2/f;->b(Lz0/e;Lj1/p;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {v6, v8}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    iget v5, v6, Lz0/e;->c:I

    .line 72
    .line 73
    if-eqz v5, :cond_10

    .line 74
    .line 75
    add-int/lit8 v5, v5, -0x1

    .line 76
    .line 77
    invoke-virtual {v6, v5}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Lj1/p;

    .line 82
    .line 83
    iget v8, v5, Lj1/p;->d:I

    .line 84
    .line 85
    and-int/lit16 v8, v8, 0x400

    .line 86
    .line 87
    if-nez v8, :cond_4

    .line 88
    .line 89
    invoke-static {v6, v5}, Li2/f;->b(Lz0/e;Lj1/p;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    :goto_2
    if-eqz v5, :cond_3

    .line 94
    .line 95
    iget v8, v5, Lj1/p;->c:I

    .line 96
    .line 97
    and-int/lit16 v8, v8, 0x400

    .line 98
    .line 99
    if-eqz v8, :cond_f

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    move-object v9, v8

    .line 103
    :goto_3
    if-eqz v5, :cond_3

    .line 104
    .line 105
    instance-of v10, v5, Lo1/v;

    .line 106
    .line 107
    const/4 v11, 0x1

    .line 108
    if-eqz v10, :cond_6

    .line 109
    .line 110
    check-cast v5, Lo1/v;

    .line 111
    .line 112
    invoke-virtual {v5}, Lo1/v;->C0()Lo1/n;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    iget-boolean v10, v10, Lo1/n;->a:Z

    .line 117
    .line 118
    if-eqz v10, :cond_5

    .line 119
    .line 120
    invoke-interface {p1, v5}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    const/4 v10, 0x7

    .line 132
    invoke-static {v5, v10, p1}, Lo1/f;->i(Lo1/v;ILic/k;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    :goto_4
    if-eqz v5, :cond_e

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    goto :goto_9

    .line 140
    :cond_6
    iget v10, v5, Lj1/p;->c:I

    .line 141
    .line 142
    and-int/lit16 v10, v10, 0x400

    .line 143
    .line 144
    if-eqz v10, :cond_7

    .line 145
    .line 146
    const/4 v10, 0x1

    .line 147
    goto :goto_5

    .line 148
    :cond_7
    const/4 v10, 0x0

    .line 149
    :goto_5
    if-eqz v10, :cond_e

    .line 150
    .line 151
    instance-of v10, v5, Li2/n;

    .line 152
    .line 153
    if-eqz v10, :cond_e

    .line 154
    .line 155
    move-object v10, v5

    .line 156
    check-cast v10, Li2/n;

    .line 157
    .line 158
    iget-object v10, v10, Li2/n;->p:Lj1/p;

    .line 159
    .line 160
    const/4 v12, 0x0

    .line 161
    :goto_6
    if-eqz v10, :cond_d

    .line 162
    .line 163
    iget v13, v10, Lj1/p;->c:I

    .line 164
    .line 165
    and-int/lit16 v13, v13, 0x400

    .line 166
    .line 167
    if-eqz v13, :cond_8

    .line 168
    .line 169
    const/4 v13, 0x1

    .line 170
    goto :goto_7

    .line 171
    :cond_8
    const/4 v13, 0x0

    .line 172
    :goto_7
    if-eqz v13, :cond_c

    .line 173
    .line 174
    add-int/lit8 v12, v12, 0x1

    .line 175
    .line 176
    if-ne v12, v11, :cond_9

    .line 177
    .line 178
    move-object v5, v10

    .line 179
    goto :goto_8

    .line 180
    :cond_9
    if-nez v9, :cond_a

    .line 181
    .line 182
    new-instance v9, Lz0/e;

    .line 183
    .line 184
    new-array v13, v7, [Lj1/p;

    .line 185
    .line 186
    invoke-direct {v9, v13}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    if-eqz v5, :cond_b

    .line 190
    .line 191
    invoke-virtual {v9, v5}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    move-object v5, v8

    .line 195
    :cond_b
    invoke-virtual {v9, v10}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_c
    :goto_8
    iget-object v10, v10, Lj1/p;->f:Lj1/p;

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_d
    if-ne v12, v11, :cond_e

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_e
    invoke-static {v9}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    goto :goto_3

    .line 209
    :cond_f
    iget-object v5, v5, Lj1/p;->f:Lj1/p;

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_10
    :goto_9
    add-int/lit8 v3, v3, 0x1

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_11
    return v4

    .line 217
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p1
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
