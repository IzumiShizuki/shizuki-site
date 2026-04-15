.class public final Loe/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Loe/k;

.field public final b:Lm0/w;


# direct methods
.method public constructor <init>(Loe/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loe/t;->a:Loe/k;

    .line 5
    .line 6
    new-instance v0, Lm0/w;

    .line 7
    .line 8
    iget-object p1, p1, Loe/k;->a:Loe/i;

    .line 9
    .line 10
    iget-object v1, p1, Loe/i;->b:Lyc/y;

    .line 11
    .line 12
    iget-object p1, p1, Loe/i;->l:Lb0/w1;

    .line 13
    .line 14
    invoke-direct {v0, v1, p1}, Lm0/w;-><init>(Lyc/y;Lb0/w1;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Loe/t;->b:Lm0/w;

    .line 18
    .line 19
    return-void
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
.method public final a(Lyc/k;)Loe/w;
    .locals 4

    .line 1
    instance-of v0, p1, Lyc/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Loe/v;

    .line 6
    .line 7
    check-cast p1, Lyc/d0;

    .line 8
    .line 9
    check-cast p1, Lbd/j0;

    .line 10
    .line 11
    iget-object p1, p1, Lbd/j0;->e:Lbe/c;

    .line 12
    .line 13
    iget-object v1, p0, Loe/t;->a:Loe/k;

    .line 14
    .line 15
    iget-object v2, v1, Loe/k;->b:Lyd/f;

    .line 16
    .line 17
    iget-object v3, v1, Loe/k;->d:Lbd/f0;

    .line 18
    .line 19
    iget-object v1, v1, Loe/k;->g:Lqe/j;

    .line 20
    .line 21
    invoke-direct {v0, p1, v2, v3, v1}, Loe/v;-><init>(Lbe/c;Lyd/f;Lbd/f0;Lyc/m0;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    instance-of v0, p1, Lqe/h;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Lqe/h;

    .line 30
    .line 31
    iget-object p1, p1, Lqe/h;->u:Loe/u;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    return-object p1
    .line 36
.end method

.method public final b(Ljava/util/List;Ljava/util/List;Lce/m;I)Ljava/util/ArrayList;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, Loe/t;->a:Loe/k;

    .line 4
    .line 5
    iget-object v0, v8, Loe/k;->c:Lyc/k;

    .line 6
    .line 7
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    .line 8
    .line 9
    invoke-static {v0, v2}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    move-object v9, v0

    .line 13
    check-cast v9, Lyc/b;

    .line 14
    .line 15
    invoke-interface {v9}, Lyc/k;->y()Lyc/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "getContainingDeclaration(...)"

    .line 20
    .line 21
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Loe/t;->a(Lyc/k;)Loe/w;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    new-instance v10, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    add-int/lit8 v13, v5, 0x1

    .line 53
    .line 54
    if-ltz v5, :cond_3

    .line 55
    .line 56
    move-object v15, v0

    .line 57
    check-cast v15, Lwd/t0;

    .line 58
    .line 59
    move-object/from16 v0, p2

    .line 60
    .line 61
    invoke-static {v5, v0}, Lvb/m;->b0(ILjava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    move-object v6, v3

    .line 66
    check-cast v6, Lwd/b1;

    .line 67
    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    iget v3, v6, Lwd/b1;->c:I

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    and-int/2addr v3, v4

    .line 74
    if-ne v3, v4, :cond_0

    .line 75
    .line 76
    iget v3, v6, Lwd/b1;->d:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const/4 v3, 0x0

    .line 80
    :goto_1
    if-eqz v2, :cond_1

    .line 81
    .line 82
    sget-object v4, Lyd/d;->c:Lyd/b;

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    new-instance v3, Lqe/u;

    .line 95
    .line 96
    iget-object v4, v8, Loe/k;->a:Loe/i;

    .line 97
    .line 98
    iget-object v4, v4, Loe/i;->a:Lre/l;

    .line 99
    .line 100
    new-instance v0, Loe/s;

    .line 101
    .line 102
    const/4 v7, 0x1

    .line 103
    move-object v12, v3

    .line 104
    move-object v14, v4

    .line 105
    move-object/from16 v3, p3

    .line 106
    .line 107
    move/from16 v4, p4

    .line 108
    .line 109
    invoke-direct/range {v0 .. v7}, Loe/s;-><init>(Loe/t;Loe/w;Lce/b;IILwd/b1;I)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v12, v14, v0}, Lqe/u;-><init>(Lre/l;Lic/a;)V

    .line 113
    .line 114
    .line 115
    move-object v3, v12

    .line 116
    goto :goto_2

    .line 117
    :cond_1
    sget-object v3, Lzc/g;->a:Lzc/f;

    .line 118
    .line 119
    :goto_2
    iget-object v0, v8, Loe/k;->h:Lid/h;

    .line 120
    .line 121
    invoke-virtual {v0, v15}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-static {v9, v0, v1, v3, v5}, Lee/m;->e(Lyc/b;Lse/w;Lbe/e;Lzc/h;I)Lbd/a0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_2
    move-object/from16 v1, p0

    .line 136
    .line 137
    move v5, v13

    .line 138
    goto :goto_0

    .line 139
    :cond_3
    const/4 v1, 0x0

    .line 140
    invoke-static {}, Lud/b;->H()V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_4
    return-object v10
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
.end method

.method public final c(Lce/m;II)Lzc/h;
    .locals 3

    .line 1
    sget-object v0, Lyd/d;->c:Lyd/b;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p1, Lzc/g;->a:Lzc/f;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p2, Lqe/u;

    .line 17
    .line 18
    iget-object v0, p0, Loe/t;->a:Loe/k;

    .line 19
    .line 20
    iget-object v0, v0, Loe/k;->a:Loe/i;

    .line 21
    .line 22
    iget-object v0, v0, Loe/i;->a:Lre/l;

    .line 23
    .line 24
    new-instance v1, Loe/q;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, p0, p1, p3, v2}, Loe/q;-><init>(Loe/t;Lce/b;II)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p2, v0, v1}, Lqe/u;-><init>(Lre/l;Lic/a;)V

    .line 31
    .line 32
    .line 33
    return-object p2
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

.method public final d(Lwd/j0;Z)Lzc/h;
    .locals 3

    .line 1
    sget-object v0, Lyd/d;->c:Lyd/b;

    .line 2
    .line 3
    iget v1, p1, Lwd/j0;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lzc/g;->a:Lzc/f;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, Lqe/u;

    .line 19
    .line 20
    iget-object v1, p0, Loe/t;->a:Loe/k;

    .line 21
    .line 22
    iget-object v1, v1, Loe/k;->a:Loe/i;

    .line 23
    .line 24
    iget-object v1, v1, Loe/i;->a:Lre/l;

    .line 25
    .line 26
    new-instance v2, Loe/r;

    .line 27
    .line 28
    invoke-direct {v2, p0, p2, p1}, Loe/r;-><init>(Loe/t;ZLwd/j0;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Lqe/u;-><init>(Lre/l;Lic/a;)V

    .line 32
    .line 33
    .line 34
    return-object v0
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

.method public final e(Lwd/n;Z)Lqe/c;
    .locals 14

    .line 1
    move-object v6, p1

    .line 2
    iget-object v12, p0, Loe/t;->a:Loe/k;

    .line 3
    .line 4
    iget-object v0, v12, Loe/k;->c:Lyc/k;

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lyc/e;

    .line 13
    .line 14
    new-instance v0, Lqe/c;

    .line 15
    .line 16
    iget v2, v6, Lwd/n;->d:I

    .line 17
    .line 18
    const/4 v13, 0x1

    .line 19
    invoke-virtual {p0, p1, v2, v13}, Loe/t;->c(Lce/m;II)Lzc/h;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v7, v12, Loe/k;->b:Lyd/f;

    .line 24
    .line 25
    iget-object v8, v12, Loe/k;->d:Lbd/f0;

    .line 26
    .line 27
    iget-object v9, v12, Loe/k;->e:Lyd/i;

    .line 28
    .line 29
    iget-object v10, v12, Loe/k;->g:Lqe/j;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    const/4 v11, 0x0

    .line 34
    move/from16 v4, p2

    .line 35
    .line 36
    invoke-direct/range {v0 .. v11}, Lqe/c;-><init>(Lyc/e;Lyc/j;Lzc/h;ZILwd/n;Lyd/f;Lbd/f0;Lyd/i;Lqe/j;Lyc/m0;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lvb/r;->a:Lvb/r;

    .line 40
    .line 41
    invoke-static {v12, v0, v2}, Loe/k;->b(Loe/k;Lbd/q;Ljava/util/List;)Loe/k;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, Loe/k;->i:Loe/t;

    .line 46
    .line 47
    iget-object v3, v6, Lwd/n;->e:Ljava/util/List;

    .line 48
    .line 49
    const-string v4, "getValueParameterList(...)"

    .line 50
    .line 51
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3, p1, v13}, Loe/t;->h(Ljava/util/List;Lce/m;I)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v3, Lyd/d;->d:Lyd/c;

    .line 59
    .line 60
    iget v4, v6, Lwd/n;->d:I

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lwd/h1;

    .line 67
    .line 68
    invoke-static {v3}, Ln7/b0;->h(Lwd/h1;)Lld/o;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v0, v2, v3}, Lbd/l;->R1(Ljava/util/List;Lld/o;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Lyc/e;->E()Lse/a0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Lbd/z;->N1(Lse/a0;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Lyc/w;->c0()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iput-boolean v1, v0, Lbd/z;->r:Z

    .line 87
    .line 88
    sget-object v1, Lyd/d;->o:Lyd/b;

    .line 89
    .line 90
    iget v2, v6, Lwd/n;->d:I

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    xor-int/2addr v1, v13

    .line 101
    iput-boolean v1, v0, Lbd/z;->v:Z

    .line 102
    .line 103
    return-object v0
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

.method public final f(Lwd/b0;)Lqe/r;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v13, v0, Loe/t;->a:Loe/k;

    .line 6
    .line 7
    iget-object v1, v13, Loe/k;->b:Lyd/f;

    .line 8
    .line 9
    iget-object v9, v13, Loe/k;->d:Lbd/f0;

    .line 10
    .line 11
    const-string v2, "proto"

    .line 12
    .line 13
    invoke-static {v7, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v2, v7, Lwd/b0;->c:I

    .line 17
    .line 18
    const/4 v14, 0x1

    .line 19
    and-int/2addr v2, v14

    .line 20
    if-ne v2, v14, :cond_0

    .line 21
    .line 22
    iget v2, v7, Lwd/b0;->d:I

    .line 23
    .line 24
    :goto_0
    move v15, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v2, v7, Lwd/b0;->e:I

    .line 27
    .line 28
    and-int/lit8 v3, v2, 0x3f

    .line 29
    .line 30
    shr-int/lit8 v2, v2, 0x8

    .line 31
    .line 32
    shl-int/lit8 v2, v2, 0x6

    .line 33
    .line 34
    add-int/2addr v2, v3

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {v0, v7, v15, v14}, Loe/t;->c(Lce/m;II)Lzc/h;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget v2, v7, Lwd/b0;->c:I

    .line 41
    .line 42
    and-int/lit8 v3, v2, 0x20

    .line 43
    .line 44
    const/16 v5, 0x20

    .line 45
    .line 46
    if-ne v3, v5, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/16 v3, 0x40

    .line 50
    .line 51
    and-int/2addr v2, v3

    .line 52
    if-ne v2, v3, :cond_2

    .line 53
    .line 54
    :goto_2
    new-instance v2, Lqe/a;

    .line 55
    .line 56
    iget-object v3, v13, Loe/k;->a:Loe/i;

    .line 57
    .line 58
    iget-object v3, v3, Loe/i;->a:Lre/l;

    .line 59
    .line 60
    new-instance v5, Loe/q;

    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    invoke-direct {v5, v0, v7, v14, v6}, Loe/q;-><init>(Loe/t;Lce/b;II)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v2, v3, v5}, Lqe/a;-><init>(Lre/o;Lic/a;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    sget-object v2, Lzc/g;->a:Lzc/f;

    .line 71
    .line 72
    :goto_3
    iget-object v3, v13, Loe/k;->c:Lyc/k;

    .line 73
    .line 74
    invoke-static {v3}, Lie/d;->g(Lyc/k;)Lbe/c;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget v5, v7, Lwd/b0;->f:I

    .line 79
    .line 80
    invoke-static {v1, v5}, Lu3/x0;->r(Lyd/f;I)Lbe/e;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v3, v5}, Lbe/c;->a(Lbe/e;)Lbe/c;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    sget-object v5, Loe/z;->a:Lbe/c;

    .line 89
    .line 90
    invoke-virtual {v3, v5}, Lbe/c;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    sget-object v3, Lyd/i;->b:Lyd/i;

    .line 97
    .line 98
    :goto_4
    move-object v10, v3

    .line 99
    goto :goto_5

    .line 100
    :cond_3
    iget-object v3, v13, Loe/k;->e:Lyd/i;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :goto_5
    new-instance v16, Lqe/r;

    .line 104
    .line 105
    move-object v3, v2

    .line 106
    iget-object v2, v13, Loe/k;->c:Lyc/k;

    .line 107
    .line 108
    iget v5, v7, Lwd/b0;->f:I

    .line 109
    .line 110
    invoke-static {v1, v5}, Lu3/x0;->r(Lyd/f;I)Lbe/e;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    sget-object v1, Lyd/d;->p:Lyd/c;

    .line 115
    .line 116
    invoke-virtual {v1, v15}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lwd/c0;

    .line 121
    .line 122
    invoke-static {v1}, Ln7/b0;->s(Lwd/c0;)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    iget-object v8, v13, Loe/k;->b:Lyd/f;

    .line 127
    .line 128
    iget-object v11, v13, Loe/k;->g:Lqe/j;

    .line 129
    .line 130
    move-object v1, v3

    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v12, 0x0

    .line 133
    move-object v14, v1

    .line 134
    move-object/from16 v1, v16

    .line 135
    .line 136
    invoke-direct/range {v1 .. v12}, Lqe/r;-><init>(Lyc/k;Lbd/s0;Lzc/h;Lbe/e;ILwd/b0;Lyd/f;Lbd/f0;Lyd/i;Lqe/j;Lyc/m0;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, v7, Lwd/b0;->i:Ljava/util/List;

    .line 140
    .line 141
    const-string v3, "getTypeParameterList(...)"

    .line 142
    .line 143
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v13, v1, v2}, Loe/k;->b(Loe/k;Lbd/q;Ljava/util/List;)Loe/k;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iget-object v3, v2, Loe/k;->i:Loe/t;

    .line 151
    .line 152
    iget-object v2, v2, Loe/k;->h:Lid/h;

    .line 153
    .line 154
    invoke-static {v7, v9}, Lud/e;->Q(Lwd/b0;Lbd/f0;)Lwd/t0;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const/4 v5, 0x0

    .line 159
    if-eqz v4, :cond_4

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-eqz v4, :cond_4

    .line 166
    .line 167
    invoke-static {v1, v4, v14}, Lee/m;->k(Lyc/b;Lse/w;Lzc/h;)Lbd/a0;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    move-object/from16 v17, v4

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_4
    move-object/from16 v17, v5

    .line 175
    .line 176
    :goto_6
    iget-object v4, v13, Loe/k;->c:Lyc/k;

    .line 177
    .line 178
    instance-of v6, v4, Lyc/e;

    .line 179
    .line 180
    if-eqz v6, :cond_5

    .line 181
    .line 182
    check-cast v4, Lyc/e;

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_5
    move-object v4, v5

    .line 186
    :goto_7
    if-eqz v4, :cond_6

    .line 187
    .line 188
    invoke-interface {v4}, Lyc/e;->T0()Lbd/a0;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    :cond_6
    move-object/from16 v18, v5

    .line 193
    .line 194
    invoke-static {v7, v9}, Lud/e;->o(Lwd/b0;Lbd/f0;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    iget-object v5, v7, Lwd/b0;->o:Ljava/util/List;

    .line 199
    .line 200
    const-string v6, "getContextParameterList(...)"

    .line 201
    .line 202
    invoke-static {v5, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const/4 v6, 0x1

    .line 206
    invoke-virtual {v3, v4, v5, v7, v6}, Loe/t;->b(Ljava/util/List;Ljava/util/List;Lce/m;I)Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    move-result-object v19

    .line 210
    invoke-virtual {v2}, Lid/h;->f()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v20

    .line 214
    iget-object v4, v7, Lwd/b0;->p:Ljava/util/List;

    .line 215
    .line 216
    const-string v5, "getValueParameterList(...)"

    .line 217
    .line 218
    invoke-static {v4, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3, v4, v7, v6}, Loe/t;->h(Ljava/util/List;Lce/m;I)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v21

    .line 225
    invoke-static {v7, v9}, Lud/e;->U(Lwd/b0;Lbd/f0;)Lwd/t0;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v2, v3}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 230
    .line 231
    .line 232
    move-result-object v22

    .line 233
    sget-object v2, Lyd/d;->e:Lyd/c;

    .line 234
    .line 235
    invoke-virtual {v2, v15}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, Lwd/d0;

    .line 240
    .line 241
    invoke-static {v2}, Loe/j;->e(Lwd/d0;)Lyc/x;

    .line 242
    .line 243
    .line 244
    move-result-object v23

    .line 245
    sget-object v2, Lyd/d;->d:Lyd/c;

    .line 246
    .line 247
    invoke-virtual {v2, v15}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Lwd/h1;

    .line 252
    .line 253
    invoke-static {v2}, Ln7/b0;->h(Lwd/h1;)Lld/o;

    .line 254
    .line 255
    .line 256
    move-result-object v24

    .line 257
    sget-object v25, Lvb/s;->a:Lvb/s;

    .line 258
    .line 259
    move-object/from16 v16, v1

    .line 260
    .line 261
    invoke-virtual/range {v16 .. v25}, Lbd/s0;->R1(Lbd/a0;Lbd/a0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lse/w;Lyc/x;Lld/o;Ljava/util/Map;)Lbd/s0;

    .line 262
    .line 263
    .line 264
    sget-object v2, Lyd/d;->q:Lyd/b;

    .line 265
    .line 266
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    iput-boolean v2, v1, Lbd/z;->m:Z

    .line 275
    .line 276
    sget-object v2, Lyd/d;->r:Lyd/b;

    .line 277
    .line 278
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    iput-boolean v2, v1, Lbd/z;->n:Z

    .line 287
    .line 288
    sget-object v2, Lyd/d;->u:Lyd/b;

    .line 289
    .line 290
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    iput-boolean v2, v1, Lbd/z;->o:Z

    .line 299
    .line 300
    sget-object v2, Lyd/d;->s:Lyd/b;

    .line 301
    .line 302
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    iput-boolean v2, v1, Lbd/z;->p:Z

    .line 311
    .line 312
    sget-object v2, Lyd/d;->t:Lyd/b;

    .line 313
    .line 314
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    iput-boolean v2, v1, Lbd/z;->q:Z

    .line 323
    .line 324
    sget-object v2, Lyd/d;->v:Lyd/b;

    .line 325
    .line 326
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    iput-boolean v2, v1, Lbd/z;->u:Z

    .line 335
    .line 336
    sget-object v2, Lyd/d;->w:Lyd/b;

    .line 337
    .line 338
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    iput-boolean v2, v1, Lbd/z;->r:Z

    .line 347
    .line 348
    sget-object v2, Lyd/d;->x:Lyd/b;

    .line 349
    .line 350
    invoke-virtual {v2, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    const/16 v26, 0x1

    .line 359
    .line 360
    xor-int/lit8 v2, v2, 0x1

    .line 361
    .line 362
    iput-boolean v2, v1, Lbd/z;->v:Z

    .line 363
    .line 364
    iget-object v2, v13, Loe/k;->a:Loe/i;

    .line 365
    .line 366
    iget-object v2, v2, Loe/i;->m:Loe/j;

    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    return-object v1
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
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

.method public final g(Lwd/j0;Z)Lqe/q;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    iget-object v1, v0, Loe/t;->a:Loe/k;

    .line 6
    .line 7
    iget-object v2, v1, Loe/k;->b:Lyd/f;

    .line 8
    .line 9
    iget-object v3, v1, Loe/k;->d:Lbd/f0;

    .line 10
    .line 11
    const-string v4, "proto"

    .line 12
    .line 13
    invoke-static {v15, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v4, v15, Lwd/j0;->c:I

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    and-int/2addr v4, v5

    .line 20
    const/16 v20, 0x6

    .line 21
    .line 22
    if-ne v4, v5, :cond_0

    .line 23
    .line 24
    iget v4, v15, Lwd/j0;->d:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget v4, v15, Lwd/j0;->e:I

    .line 28
    .line 29
    and-int/lit8 v6, v4, 0x3f

    .line 30
    .line 31
    shr-int/lit8 v4, v4, 0x8

    .line 32
    .line 33
    shl-int/lit8 v4, v4, 0x6

    .line 34
    .line 35
    add-int/2addr v4, v6

    .line 36
    :goto_0
    sget-object v21, Lzc/g;->a:Lzc/f;

    .line 37
    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    iget-object v7, v15, Lwd/j0;->u:Ljava/util/List;

    .line 41
    .line 42
    const-string v8, "getAnnotationList(...)"

    .line 43
    .line 44
    invoke-static {v7, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast v7, Ljava/lang/Iterable;

    .line 48
    .line 49
    new-instance v8, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v9, 0xa

    .line 52
    .line 53
    invoke-static {v7, v9}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eqz v9, :cond_1

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    check-cast v9, Lwd/h;

    .line 75
    .line 76
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v10, v0, Loe/t;->b:Lm0/w;

    .line 80
    .line 81
    invoke-virtual {v10, v9, v2}, Lm0/w;->v(Lwd/h;Lyd/f;)Lzc/c;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_2

    .line 94
    .line 95
    move-object/from16 v7, v21

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    new-instance v7, Lzc/i;

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-direct {v7, v9, v8}, Lzc/i;-><init>(ILjava/util/List;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const/4 v7, 0x0

    .line 106
    :goto_2
    new-instance v9, Lqe/q;

    .line 107
    .line 108
    iget-object v8, v1, Loe/k;->c:Lyc/k;

    .line 109
    .line 110
    if-nez v7, :cond_4

    .line 111
    .line 112
    const/4 v7, 0x2

    .line 113
    invoke-virtual {v0, v15, v4, v7}, Loe/t;->c(Lce/m;II)Lzc/h;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :cond_4
    sget-object v10, Lyd/d;->e:Lyd/c;

    .line 118
    .line 119
    invoke-virtual {v10, v4}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    check-cast v11, Lwd/d0;

    .line 124
    .line 125
    invoke-static {v11}, Loe/j;->e(Lwd/d0;)Lyc/x;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    sget-object v12, Lyd/d;->d:Lyd/c;

    .line 130
    .line 131
    invoke-virtual {v12, v4}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    check-cast v13, Lwd/h1;

    .line 136
    .line 137
    invoke-static {v13}, Ln7/b0;->h(Lwd/h1;)Lld/o;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    sget-object v14, Lyd/d;->y:Lyd/b;

    .line 142
    .line 143
    invoke-virtual {v14, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    iget v5, v15, Lwd/j0;->f:I

    .line 152
    .line 153
    invoke-static {v2, v5}, Lu3/x0;->r(Lyd/f;I)Lbe/e;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    sget-object v5, Lyd/d;->p:Lyd/c;

    .line 158
    .line 159
    invoke-virtual {v5, v4}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, Lwd/c0;

    .line 164
    .line 165
    invoke-static {v5}, Ln7/b0;->s(Lwd/c0;)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    sget-object v6, Lyd/d;->C:Lyd/b;

    .line 170
    .line 171
    invoke-virtual {v6, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    move-object/from16 p2, v2

    .line 180
    .line 181
    sget-object v2, Lyd/d;->B:Lyd/b;

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    sget-object v2, Lyd/d;->E:Lyd/b;

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    move/from16 v19, v2

    .line 204
    .line 205
    sget-object v2, Lyd/d;->F:Lyd/b;

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    move/from16 v22, v2

    .line 216
    .line 217
    sget-object v2, Lyd/d;->G:Lyd/b;

    .line 218
    .line 219
    invoke-virtual {v2, v4}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    move/from16 v23, v2

    .line 228
    .line 229
    iget-object v2, v1, Loe/k;->b:Lyd/f;

    .line 230
    .line 231
    move-object/from16 v24, v2

    .line 232
    .line 233
    iget-object v2, v1, Loe/k;->e:Lyd/i;

    .line 234
    .line 235
    move-object/from16 v25, v2

    .line 236
    .line 237
    iget-object v2, v1, Loe/k;->g:Lqe/j;

    .line 238
    .line 239
    move-object/from16 v17, v3

    .line 240
    .line 241
    const/16 v26, 0x0

    .line 242
    .line 243
    const/4 v3, 0x0

    .line 244
    move-object v0, v1

    .line 245
    move-object v1, v9

    .line 246
    move-object/from16 v27, v10

    .line 247
    .line 248
    move-object/from16 v28, v12

    .line 249
    .line 250
    move/from16 v12, v19

    .line 251
    .line 252
    move-object/from16 v16, v24

    .line 253
    .line 254
    move-object/from16 v19, v2

    .line 255
    .line 256
    move v9, v5

    .line 257
    move v10, v6

    .line 258
    move-object v2, v8

    .line 259
    move-object v5, v11

    .line 260
    move-object v6, v13

    .line 261
    move/from16 v11, v18

    .line 262
    .line 263
    move/from16 v13, v22

    .line 264
    .line 265
    move-object/from16 v18, v25

    .line 266
    .line 267
    move-object/from16 v8, p2

    .line 268
    .line 269
    move/from16 v22, v4

    .line 270
    .line 271
    move-object v4, v7

    .line 272
    move v7, v14

    .line 273
    move/from16 v14, v23

    .line 274
    .line 275
    invoke-direct/range {v1 .. v19}, Lqe/q;-><init>(Lyc/k;Lyc/k0;Lzc/h;Lyc/x;Lld/o;ZLbe/e;IZZZZZLwd/j0;Lyd/f;Lbd/f0;Lyd/i;Lqe/j;)V

    .line 276
    .line 277
    .line 278
    move-object v9, v1

    .line 279
    move-object v1, v15

    .line 280
    move-object/from16 v2, v17

    .line 281
    .line 282
    iget-object v3, v1, Lwd/j0;->i:Ljava/util/List;

    .line 283
    .line 284
    const-string v4, "getTypeParameterList(...)"

    .line 285
    .line 286
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v0, v9, v3}, Loe/k;->b(Loe/k;Lbd/q;Ljava/util/List;)Loe/k;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    iget-object v4, v3, Loe/k;->h:Lid/h;

    .line 294
    .line 295
    sget-object v5, Lyd/d;->z:Lyd/b;

    .line 296
    .line 297
    move/from16 v6, v22

    .line 298
    .line 299
    invoke-virtual {v5, v6}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    const/4 v7, 0x3

    .line 308
    if-eqz v5, :cond_6

    .line 309
    .line 310
    iget v8, v1, Lwd/j0;->c:I

    .line 311
    .line 312
    and-int/lit8 v10, v8, 0x20

    .line 313
    .line 314
    const/16 v11, 0x20

    .line 315
    .line 316
    if-ne v10, v11, :cond_5

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_5
    const/16 v10, 0x40

    .line 320
    .line 321
    and-int/2addr v8, v10

    .line 322
    if-ne v8, v10, :cond_6

    .line 323
    .line 324
    :goto_3
    new-instance v8, Lqe/a;

    .line 325
    .line 326
    iget-object v10, v0, Loe/k;->a:Loe/i;

    .line 327
    .line 328
    iget-object v10, v10, Loe/i;->a:Lre/l;

    .line 329
    .line 330
    new-instance v11, Loe/q;

    .line 331
    .line 332
    const/4 v12, 0x1

    .line 333
    move-object/from16 v14, p0

    .line 334
    .line 335
    invoke-direct {v11, v14, v1, v7, v12}, Loe/q;-><init>(Loe/t;Lce/b;II)V

    .line 336
    .line 337
    .line 338
    invoke-direct {v8, v10, v11}, Lqe/a;-><init>(Lre/o;Lic/a;)V

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_6
    move-object/from16 v14, p0

    .line 343
    .line 344
    move-object/from16 v8, v21

    .line 345
    .line 346
    :goto_4
    invoke-static {v1, v2}, Lud/e;->V(Lwd/j0;Lbd/f0;)Lwd/t0;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-virtual {v4, v10}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    move-object v11, v10

    .line 355
    invoke-virtual {v4}, Lid/h;->f()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    iget-object v12, v0, Loe/k;->c:Lyc/k;

    .line 360
    .line 361
    instance-of v13, v12, Lyc/e;

    .line 362
    .line 363
    if-eqz v13, :cond_7

    .line 364
    .line 365
    check-cast v12, Lyc/e;

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_7
    const/4 v12, 0x0

    .line 369
    :goto_5
    if-eqz v12, :cond_8

    .line 370
    .line 371
    invoke-interface {v12}, Lyc/e;->T0()Lbd/a0;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    move-object/from16 v29, v12

    .line 376
    .line 377
    move-object v12, v11

    .line 378
    move-object/from16 v11, v29

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_8
    move-object v12, v11

    .line 382
    const/4 v11, 0x0

    .line 383
    :goto_6
    invoke-static {v1, v2}, Lud/e;->R(Lwd/j0;Lbd/f0;)Lwd/t0;

    .line 384
    .line 385
    .line 386
    move-result-object v13

    .line 387
    if-eqz v13, :cond_9

    .line 388
    .line 389
    invoke-virtual {v4, v13}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    if-eqz v4, :cond_9

    .line 394
    .line 395
    invoke-static {v9, v4, v8}, Lee/m;->k(Lyc/b;Lse/w;Lzc/h;)Lbd/a0;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    move-object v8, v9

    .line 400
    move-object v9, v12

    .line 401
    move-object v12, v4

    .line 402
    goto :goto_7

    .line 403
    :cond_9
    move-object v8, v9

    .line 404
    move-object v9, v12

    .line 405
    const/4 v12, 0x0

    .line 406
    :goto_7
    iget-object v4, v3, Loe/k;->i:Loe/t;

    .line 407
    .line 408
    invoke-static {v1, v2}, Lud/e;->p(Lwd/j0;Lbd/f0;)Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iget-object v13, v1, Lwd/j0;->o:Ljava/util/List;

    .line 413
    .line 414
    const-string v15, "getContextParameterList(...)"

    .line 415
    .line 416
    invoke-static {v13, v15}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v2, v13, v1, v7}, Loe/t;->b(Ljava/util/List;Ljava/util/List;Lce/m;I)Ljava/util/ArrayList;

    .line 420
    .line 421
    .line 422
    move-result-object v13

    .line 423
    invoke-virtual/range {v8 .. v13}, Lbd/p0;->K1(Lse/w;Ljava/util/List;Lbd/a0;Lbd/a0;Ljava/util/List;)V

    .line 424
    .line 425
    .line 426
    move-object v9, v8

    .line 427
    sget-object v2, Lyd/d;->c:Lyd/b;

    .line 428
    .line 429
    invoke-virtual {v2, v6}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    move-object/from16 v4, v28

    .line 438
    .line 439
    invoke-virtual {v4, v6}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    check-cast v8, Lwd/h1;

    .line 444
    .line 445
    move-object/from16 v10, v27

    .line 446
    .line 447
    invoke-virtual {v10, v6}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v11

    .line 451
    check-cast v11, Lwd/d0;

    .line 452
    .line 453
    invoke-static {v2, v8, v11}, Lyd/d;->b(ZLwd/h1;Lwd/d0;)I

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    sget-object v18, Lyc/m0;->p0:Lyc/n0;

    .line 458
    .line 459
    if-eqz v5, :cond_c

    .line 460
    .line 461
    iget v5, v1, Lwd/j0;->c:I

    .line 462
    .line 463
    const/16 v8, 0x100

    .line 464
    .line 465
    and-int/2addr v5, v8

    .line 466
    if-ne v5, v8, :cond_a

    .line 467
    .line 468
    iget v5, v1, Lwd/j0;->q:I

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_a
    move v5, v2

    .line 472
    :goto_8
    sget-object v8, Lyd/d;->K:Lyd/b;

    .line 473
    .line 474
    invoke-virtual {v8, v5}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    sget-object v11, Lyd/d;->L:Lyd/b;

    .line 483
    .line 484
    invoke-virtual {v11, v5}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 485
    .line 486
    .line 487
    move-result-object v11

    .line 488
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    sget-object v12, Lyd/d;->M:Lyd/b;

    .line 493
    .line 494
    invoke-virtual {v12, v5}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 495
    .line 496
    .line 497
    move-result-object v12

    .line 498
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 499
    .line 500
    .line 501
    move-result v15

    .line 502
    invoke-virtual {v14, v1, v5, v7}, Loe/t;->c(Lce/m;II)Lzc/h;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    if-eqz v8, :cond_b

    .line 507
    .line 508
    move v12, v8

    .line 509
    new-instance v8, Lbd/q0;

    .line 510
    .line 511
    invoke-virtual {v10, v5}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    check-cast v13, Lwd/d0;

    .line 516
    .line 517
    invoke-static {v13}, Loe/j;->e(Lwd/d0;)Lyc/x;

    .line 518
    .line 519
    .line 520
    move-result-object v13

    .line 521
    invoke-virtual {v4, v5}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    check-cast v5, Lwd/h1;

    .line 526
    .line 527
    invoke-static {v5}, Ln7/b0;->h(Lwd/h1;)Lld/o;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    move/from16 p2, v2

    .line 532
    .line 533
    const/4 v2, 0x1

    .line 534
    xor-int/2addr v12, v2

    .line 535
    invoke-virtual {v9}, Lbd/p0;->j()I

    .line 536
    .line 537
    .line 538
    move-result v16

    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    move/from16 v29, v12

    .line 542
    .line 543
    move-object v12, v5

    .line 544
    move-object v5, v14

    .line 545
    move v14, v11

    .line 546
    move-object v11, v13

    .line 547
    move/from16 v13, v29

    .line 548
    .line 549
    move-object/from16 v29, v10

    .line 550
    .line 551
    move-object v10, v7

    .line 552
    move-object/from16 v7, v29

    .line 553
    .line 554
    invoke-direct/range {v8 .. v18}, Lbd/q0;-><init>(Lyc/k0;Lzc/h;Lyc/x;Lld/o;ZZZILbd/q0;Lyc/m0;)V

    .line 555
    .line 556
    .line 557
    goto :goto_9

    .line 558
    :cond_b
    move-object/from16 p2, v10

    .line 559
    .line 560
    move-object v10, v7

    .line 561
    move-object/from16 v7, p2

    .line 562
    .line 563
    move/from16 p2, v2

    .line 564
    .line 565
    move-object v5, v14

    .line 566
    const/4 v2, 0x1

    .line 567
    invoke-static {v9, v10}, Lee/m;->f(Lyc/k0;Lzc/h;)Lbd/q0;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    :goto_9
    invoke-virtual {v9}, Lbd/p0;->n()Lse/w;

    .line 572
    .line 573
    .line 574
    move-result-object v10

    .line 575
    invoke-virtual {v8, v10}, Lbd/q0;->G1(Lse/w;)V

    .line 576
    .line 577
    .line 578
    goto :goto_a

    .line 579
    :cond_c
    move/from16 p2, v2

    .line 580
    .line 581
    move-object v7, v10

    .line 582
    move-object v5, v14

    .line 583
    const/4 v2, 0x1

    .line 584
    const/4 v8, 0x0

    .line 585
    :goto_a
    sget-object v10, Lyd/d;->A:Lyd/b;

    .line 586
    .line 587
    invoke-virtual {v10, v6}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 588
    .line 589
    .line 590
    move-result-object v10

    .line 591
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 592
    .line 593
    .line 594
    move-result v10

    .line 595
    if-eqz v10, :cond_10

    .line 596
    .line 597
    iget v10, v1, Lwd/j0;->c:I

    .line 598
    .line 599
    const/16 v11, 0x200

    .line 600
    .line 601
    and-int/2addr v10, v11

    .line 602
    if-ne v10, v11, :cond_d

    .line 603
    .line 604
    iget v10, v1, Lwd/j0;->r:I

    .line 605
    .line 606
    goto :goto_b

    .line 607
    :cond_d
    move/from16 v10, p2

    .line 608
    .line 609
    :goto_b
    sget-object v11, Lyd/d;->K:Lyd/b;

    .line 610
    .line 611
    invoke-virtual {v11, v10}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    sget-object v12, Lyd/d;->L:Lyd/b;

    .line 620
    .line 621
    invoke-virtual {v12, v10}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 622
    .line 623
    .line 624
    move-result-object v12

    .line 625
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 626
    .line 627
    .line 628
    move-result v14

    .line 629
    sget-object v12, Lyd/d;->M:Lyd/b;

    .line 630
    .line 631
    invoke-virtual {v12, v10}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 632
    .line 633
    .line 634
    move-result-object v12

    .line 635
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 636
    .line 637
    .line 638
    move-result v15

    .line 639
    const/4 v12, 0x4

    .line 640
    invoke-virtual {v5, v1, v10, v12}, Loe/t;->c(Lce/m;II)Lzc/h;

    .line 641
    .line 642
    .line 643
    move-result-object v13

    .line 644
    if-eqz v11, :cond_f

    .line 645
    .line 646
    move-object/from16 v16, v8

    .line 647
    .line 648
    new-instance v8, Lbd/r0;

    .line 649
    .line 650
    invoke-virtual {v7, v10}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    check-cast v7, Lwd/d0;

    .line 655
    .line 656
    invoke-static {v7}, Loe/j;->e(Lwd/d0;)Lyc/x;

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    invoke-virtual {v4, v10}, Lyd/c;->d(I)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    check-cast v4, Lwd/h1;

    .line 665
    .line 666
    invoke-static {v4}, Ln7/b0;->h(Lwd/h1;)Lld/o;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    xor-int/lit8 v10, v11, 0x1

    .line 671
    .line 672
    move-object/from16 v11, v16

    .line 673
    .line 674
    invoke-virtual {v9}, Lbd/p0;->j()I

    .line 675
    .line 676
    .line 677
    move-result v16

    .line 678
    const/16 v17, 0x0

    .line 679
    .line 680
    move-object v12, v13

    .line 681
    move v13, v10

    .line 682
    move-object v10, v12

    .line 683
    move-object v12, v4

    .line 684
    move-object v4, v11

    .line 685
    move-object v11, v7

    .line 686
    const/4 v7, 0x4

    .line 687
    invoke-direct/range {v8 .. v18}, Lbd/r0;-><init>(Lyc/k0;Lzc/h;Lyc/x;Lld/o;ZZZILbd/r0;Lyc/m0;)V

    .line 688
    .line 689
    .line 690
    sget-object v10, Lvb/r;->a:Lvb/r;

    .line 691
    .line 692
    invoke-static {v3, v8, v10}, Loe/k;->b(Loe/k;Lbd/q;Ljava/util/List;)Loe/k;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    iget-object v3, v3, Loe/k;->i:Loe/t;

    .line 697
    .line 698
    iget-object v10, v1, Lwd/j0;->p:Lwd/b1;

    .line 699
    .line 700
    invoke-static {v10}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 701
    .line 702
    .line 703
    move-result-object v10

    .line 704
    invoke-virtual {v3, v10, v1, v7}, Loe/t;->h(Ljava/util/List;Lce/m;I)Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    invoke-static {v3}, Lvb/m;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    check-cast v3, Lbd/y0;

    .line 713
    .line 714
    if-eqz v3, :cond_e

    .line 715
    .line 716
    iput-object v3, v8, Lbd/r0;->m:Lbd/y0;

    .line 717
    .line 718
    move-object v7, v8

    .line 719
    const/4 v3, 0x0

    .line 720
    goto :goto_c

    .line 721
    :cond_e
    invoke-static/range {v20 .. v20}, Lbd/r0;->U0(I)V

    .line 722
    .line 723
    .line 724
    const/4 v3, 0x0

    .line 725
    throw v3

    .line 726
    :cond_f
    move-object v4, v8

    .line 727
    move-object v10, v13

    .line 728
    const/4 v3, 0x0

    .line 729
    invoke-static {v9, v10}, Lee/m;->g(Lyc/k0;Lzc/h;)Lbd/r0;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    goto :goto_c

    .line 734
    :cond_10
    move-object v4, v8

    .line 735
    const/4 v3, 0x0

    .line 736
    move-object v7, v3

    .line 737
    :goto_c
    sget-object v8, Lyd/d;->D:Lyd/b;

    .line 738
    .line 739
    invoke-virtual {v8, v6}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    if-eqz v6, :cond_11

    .line 748
    .line 749
    new-instance v6, Loe/p;

    .line 750
    .line 751
    const/4 v8, 0x0

    .line 752
    invoke-direct {v6, v5, v1, v9, v8}, Loe/p;-><init>(Loe/t;Lwd/j0;Lqe/q;I)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v9, v3, v6}, Lbd/p0;->I1(Lre/h;Lic/a;)V

    .line 756
    .line 757
    .line 758
    :cond_11
    iget-object v0, v0, Loe/k;->c:Lyc/k;

    .line 759
    .line 760
    instance-of v6, v0, Lyc/e;

    .line 761
    .line 762
    if-eqz v6, :cond_12

    .line 763
    .line 764
    move-object v6, v0

    .line 765
    check-cast v6, Lyc/e;

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :cond_12
    move-object v6, v3

    .line 769
    :goto_d
    if-eqz v6, :cond_13

    .line 770
    .line 771
    invoke-interface {v6}, Lyc/e;->j()Lyc/f;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    goto :goto_e

    .line 776
    :cond_13
    move-object v6, v3

    .line 777
    :goto_e
    sget-object v0, Lyc/f;->e:Lyc/f;

    .line 778
    .line 779
    if-ne v6, v0, :cond_14

    .line 780
    .line 781
    new-instance v0, Loe/p;

    .line 782
    .line 783
    const/4 v6, 0x1

    .line 784
    invoke-direct {v0, v5, v1, v9, v6}, Loe/p;-><init>(Loe/t;Lwd/j0;Lqe/q;I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v9, v3, v0}, Lbd/p0;->I1(Lre/h;Lic/a;)V

    .line 788
    .line 789
    .line 790
    :cond_14
    new-instance v0, Lbd/w;

    .line 791
    .line 792
    const/4 v3, 0x0

    .line 793
    invoke-virtual {v5, v1, v3}, Loe/t;->d(Lwd/j0;Z)Lzc/h;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-direct {v0, v3}, Landroidx/lifecycle/q;-><init>(Lzc/h;)V

    .line 798
    .line 799
    .line 800
    new-instance v3, Lbd/w;

    .line 801
    .line 802
    invoke-virtual {v5, v1, v2}, Loe/t;->d(Lwd/j0;Z)Lzc/h;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-direct {v3, v1}, Landroidx/lifecycle/q;-><init>(Lzc/h;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v9, v4, v7, v0, v3}, Lbd/p0;->H1(Lbd/q0;Lbd/r0;Lbd/w;Lbd/w;)V

    .line 810
    .line 811
    .line 812
    return-object v9
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
.end method

.method public final h(Ljava/util/List;Lce/m;I)Ljava/util/List;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, Loe/t;->a:Loe/k;

    .line 4
    .line 5
    iget-object v9, v8, Loe/k;->d:Lbd/f0;

    .line 6
    .line 7
    iget-object v10, v8, Loe/k;->h:Lid/h;

    .line 8
    .line 9
    iget-object v0, v8, Loe/k;->c:Lyc/k;

    .line 10
    .line 11
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    .line 12
    .line 13
    invoke-static {v0, v2}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v12, v0

    .line 17
    check-cast v12, Lyc/b;

    .line 18
    .line 19
    invoke-interface {v12}, Lyc/k;->y()Lyc/k;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "getContainingDeclaration(...)"

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Loe/t;->a(Lyc/k;)Loe/w;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, Ljava/lang/Iterable;

    .line 35
    .line 36
    new-instance v11, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v3, 0xa

    .line 39
    .line 40
    invoke-static {v0, v3}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v23

    .line 51
    const/16 v24, 0x0

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    :goto_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    add-int/lit8 v25, v14, 0x1

    .line 65
    .line 66
    if-ltz v14, :cond_3

    .line 67
    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, Lwd/b1;

    .line 70
    .line 71
    iget v0, v6, Lwd/b1;->c:I

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    and-int/2addr v0, v3

    .line 75
    if-ne v0, v3, :cond_0

    .line 76
    .line 77
    iget v0, v6, Lwd/b1;->d:I

    .line 78
    .line 79
    move v15, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    const/4 v15, 0x0

    .line 82
    :goto_1
    if-eqz v2, :cond_1

    .line 83
    .line 84
    sget-object v0, Lyd/d;->c:Lyd/b;

    .line 85
    .line 86
    invoke-virtual {v0, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    new-instance v0, Lqe/u;

    .line 97
    .line 98
    iget-object v3, v8, Loe/k;->a:Loe/i;

    .line 99
    .line 100
    iget-object v3, v3, Loe/i;->a:Lre/l;

    .line 101
    .line 102
    move-object v4, v0

    .line 103
    new-instance v0, Loe/s;

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    move-object v13, v3

    .line 107
    move v5, v14

    .line 108
    const/16 p1, 0x0

    .line 109
    .line 110
    move-object/from16 v3, p2

    .line 111
    .line 112
    move-object v14, v4

    .line 113
    move/from16 v4, p3

    .line 114
    .line 115
    invoke-direct/range {v0 .. v7}, Loe/s;-><init>(Loe/t;Loe/w;Lce/b;IILwd/b1;I)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v14, v13, v0}, Lqe/u;-><init>(Lre/l;Lic/a;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v14

    .line 122
    goto :goto_2

    .line 123
    :cond_1
    move v5, v14

    .line 124
    const/16 p1, 0x0

    .line 125
    .line 126
    sget-object v0, Lzc/g;->a:Lzc/f;

    .line 127
    .line 128
    :goto_2
    iget-object v1, v8, Loe/k;->b:Lyd/f;

    .line 129
    .line 130
    iget v3, v6, Lwd/b1;->e:I

    .line 131
    .line 132
    invoke-static {v1, v3}, Lu3/x0;->r(Lyd/f;I)Lbe/e;

    .line 133
    .line 134
    .line 135
    move-result-object v16

    .line 136
    invoke-static {v6, v9}, Lud/e;->f0(Lwd/b1;Lbd/f0;)Lwd/t0;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v10, v1}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 141
    .line 142
    .line 143
    move-result-object v17

    .line 144
    sget-object v1, Lyd/d;->H:Lyd/b;

    .line 145
    .line 146
    invoke-virtual {v1, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v18

    .line 154
    sget-object v1, Lyd/d;->I:Lyd/b;

    .line 155
    .line 156
    invoke-virtual {v1, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v19

    .line 164
    sget-object v1, Lyd/d;->J:Lyd/b;

    .line 165
    .line 166
    invoke-virtual {v1, v15}, Lyd/b;->f(I)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v20

    .line 174
    invoke-static {v6, v9}, Lud/e;->i0(Lwd/b1;Lbd/f0;)Lwd/t0;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    if-eqz v1, :cond_2

    .line 179
    .line 180
    invoke-virtual {v10, v1}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    move-object/from16 v21, v13

    .line 185
    .line 186
    :goto_3
    move-object v1, v11

    .line 187
    goto :goto_4

    .line 188
    :cond_2
    move-object/from16 v21, p1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :goto_4
    new-instance v11, Lbd/y0;

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    sget-object v22, Lyc/m0;->p0:Lyc/n0;

    .line 195
    .line 196
    move-object v15, v0

    .line 197
    move v14, v5

    .line 198
    invoke-direct/range {v11 .. v22}, Lbd/y0;-><init>(Lyc/b;Lbd/y0;ILzc/h;Lbe/e;Lse/w;ZZZLse/w;Lyc/m0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-object v11, v1

    .line 205
    move/from16 v14, v25

    .line 206
    .line 207
    move-object/from16 v1, p0

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_3
    const/16 p1, 0x0

    .line 212
    .line 213
    invoke-static {}, Lud/b;->H()V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_4
    move-object v1, v11

    .line 218
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
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
.end method
