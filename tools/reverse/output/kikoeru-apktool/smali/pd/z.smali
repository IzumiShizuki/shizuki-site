.class public abstract Lpd/z;
.super Lle/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic m:[Lpc/u;


# instance fields
.field public final b:Lb0/w1;

.field public final c:Lpd/z;

.field public final d:Lre/c;

.field public final e:Lre/i;

.field public final f:Lre/e;

.field public final g:Lre/j;

.field public final h:Lre/e;

.field public final i:Lre/i;

.field public final j:Lre/i;

.field public final k:Lre/i;

.field public final l:Lre/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Lpd/z;

    .line 4
    .line 5
    const-string v2, "functionNamesLazy"

    .line 6
    .line 7
    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "propertyNamesLazy"

    .line 20
    .line 21
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 22
    .line 23
    invoke-static {v1, v3, v5, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "classNamesLazy"

    .line 28
    .line 29
    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

    .line 30
    .line 31
    invoke-static {v1, v5, v6, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x3

    .line 36
    new-array v2, v2, [Lpc/u;

    .line 37
    .line 38
    aput-object v0, v2, v4

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    aput-object v3, v2, v0

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    aput-object v1, v2, v0

    .line 45
    .line 46
    sput-object v2, Lpd/z;->m:[Lpc/u;

    .line 47
    .line 48
    return-void
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
.end method

.method public constructor <init>(Lb0/w1;Lpd/n;)V
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lpd/z;->b:Lb0/w1;

    .line 10
    .line 11
    iput-object p2, p0, Lpd/z;->c:Lpd/z;

    .line 12
    .line 13
    iget-object p1, p1, Lb0/w1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lod/a;

    .line 16
    .line 17
    iget-object p1, p1, Lod/a;->a:Lre/o;

    .line 18
    .line 19
    new-instance p2, Lpd/v;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p2, p0, v0}, Lpd/v;-><init>(Lpd/z;I)V

    .line 23
    .line 24
    .line 25
    move-object v0, p1

    .line 26
    check-cast v0, Lre/l;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v1, Lre/c;

    .line 32
    .line 33
    invoke-direct {v1, v0, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lpd/z;->d:Lre/c;

    .line 37
    .line 38
    new-instance p2, Lpd/v;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-direct {p2, p0, v0}, Lpd/v;-><init>(Lpd/z;I)V

    .line 42
    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lre/l;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v1, Lre/i;

    .line 51
    .line 52
    invoke-direct {v1, v0, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lpd/z;->e:Lre/i;

    .line 56
    .line 57
    new-instance p2, Lpd/x;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-direct {p2, p0, v0}, Lpd/x;-><init>(Lpd/z;I)V

    .line 61
    .line 62
    .line 63
    move-object v0, p1

    .line 64
    check-cast v0, Lre/l;

    .line 65
    .line 66
    invoke-virtual {v0, p2}, Lre/l;->b(Lic/k;)Lre/e;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iput-object p2, p0, Lpd/z;->f:Lre/e;

    .line 71
    .line 72
    new-instance p2, Lpd/x;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-direct {p2, p0, v0}, Lpd/x;-><init>(Lpd/z;I)V

    .line 76
    .line 77
    .line 78
    move-object v0, p1

    .line 79
    check-cast v0, Lre/l;

    .line 80
    .line 81
    invoke-virtual {v0, p2}, Lre/l;->c(Lic/k;)Lre/j;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iput-object p2, p0, Lpd/z;->g:Lre/j;

    .line 86
    .line 87
    new-instance p2, Lpd/x;

    .line 88
    .line 89
    const/4 v0, 0x2

    .line 90
    invoke-direct {p2, p0, v0}, Lpd/x;-><init>(Lpd/z;I)V

    .line 91
    .line 92
    .line 93
    move-object v0, p1

    .line 94
    check-cast v0, Lre/l;

    .line 95
    .line 96
    invoke-virtual {v0, p2}, Lre/l;->b(Lic/k;)Lre/e;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, p0, Lpd/z;->h:Lre/e;

    .line 101
    .line 102
    new-instance p2, Lpd/v;

    .line 103
    .line 104
    const/4 v0, 0x2

    .line 105
    invoke-direct {p2, p0, v0}, Lpd/v;-><init>(Lpd/z;I)V

    .line 106
    .line 107
    .line 108
    move-object v0, p1

    .line 109
    check-cast v0, Lre/l;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v1, Lre/i;

    .line 115
    .line 116
    invoke-direct {v1, v0, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, Lpd/z;->i:Lre/i;

    .line 120
    .line 121
    new-instance p2, Lpd/v;

    .line 122
    .line 123
    const/4 v0, 0x3

    .line 124
    invoke-direct {p2, p0, v0}, Lpd/v;-><init>(Lpd/z;I)V

    .line 125
    .line 126
    .line 127
    move-object v0, p1

    .line 128
    check-cast v0, Lre/l;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v1, Lre/i;

    .line 134
    .line 135
    invoke-direct {v1, v0, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, p0, Lpd/z;->j:Lre/i;

    .line 139
    .line 140
    new-instance p2, Lpd/v;

    .line 141
    .line 142
    const/4 v0, 0x4

    .line 143
    invoke-direct {p2, p0, v0}, Lpd/v;-><init>(Lpd/z;I)V

    .line 144
    .line 145
    .line 146
    move-object v0, p1

    .line 147
    check-cast v0, Lre/l;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v1, Lre/i;

    .line 153
    .line 154
    invoke-direct {v1, v0, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 155
    .line 156
    .line 157
    iput-object v1, p0, Lpd/z;->k:Lre/i;

    .line 158
    .line 159
    new-instance p2, Lpd/x;

    .line 160
    .line 161
    const/4 v0, 0x3

    .line 162
    invoke-direct {p2, p0, v0}, Lpd/x;-><init>(Lpd/z;I)V

    .line 163
    .line 164
    .line 165
    check-cast p1, Lre/l;

    .line 166
    .line 167
    invoke-virtual {p1, p2}, Lre/l;->b(Lic/k;)Lre/e;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lpd/z;->l:Lre/e;

    .line 172
    .line 173
    return-void
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

.method public static l(Led/x;Lb0/w1;)Lse/w;
    .locals 4

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Led/x;->b()Ljava/lang/reflect/Member;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/reflect/Method;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getDeclaringClass(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x6

    .line 27
    sget-object v3, Lse/s0;->b:Lse/s0;

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Ln7/e;->F(Lse/s0;ZLpd/e0;I)Lqd/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object p1, p1, Lb0/w1;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lc7/e1;

    .line 36
    .line 37
    invoke-virtual {p0}, Led/x;->f()Led/b0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1, p0, v0}, Lc7/e1;->h0(Lsd/d;Lqd/a;)Lse/w;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
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

.method public static u(Lb0/w1;Lbd/z;Ljava/util/List;)Lk5/d;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lc7/e1;

    .line 6
    .line 7
    iget-object v2, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lod/a;

    .line 10
    .line 11
    iget-object v3, v2, Lod/a;->o:Lyc/y;

    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    check-cast v4, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {v4}, Lvb/m;->L0(Ljava/lang/Iterable;)Ldf/o;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v6, 0xa

    .line 24
    .line 25
    invoke-static {v4, v6}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ldf/o;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    :goto_0
    move-object v8, v4

    .line 39
    check-cast v8, Ldf/b;

    .line 40
    .line 41
    iget-object v9, v8, Ldf/b;->b:Ljava/util/Iterator;

    .line 42
    .line 43
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-eqz v9, :cond_7

    .line 48
    .line 49
    invoke-virtual {v8}, Ldf/b;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Lvb/u;

    .line 54
    .line 55
    iget v12, v8, Lvb/u;->a:I

    .line 56
    .line 57
    iget-object v8, v8, Lvb/u;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Led/d0;

    .line 60
    .line 61
    invoke-static {v0, v8}, Ln7/e;->z(Lb0/w1;Lsd/b;)Lod/c;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    sget-object v9, Lse/s0;->b:Lse/s0;

    .line 66
    .line 67
    const/4 v10, 0x7

    .line 68
    const/4 v11, 0x0

    .line 69
    invoke-static {v9, v6, v11, v10}, Ln7/e;->F(Lse/s0;ZLpd/e0;I)Lqd/a;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    iget-boolean v10, v8, Led/d0;->d:Z

    .line 74
    .line 75
    iget-object v14, v8, Led/d0;->a:Led/b0;

    .line 76
    .line 77
    const/4 v15, 0x1

    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    instance-of v10, v14, Led/i;

    .line 81
    .line 82
    if-eqz v10, :cond_0

    .line 83
    .line 84
    check-cast v14, Led/i;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    move-object v14, v11

    .line 88
    :goto_1
    if-eqz v14, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1, v14, v9, v15}, Lc7/e1;->g0(Led/i;Lqd/a;Z)Lse/w0;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-interface {v3}, Lyc/y;->g()Lvc/i;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10, v9}, Lvc/i;->f(Lse/w;)Lse/w;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    new-instance v14, Lub/k;

    .line 103
    .line 104
    invoke-direct {v14, v9, v10}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Vararg parameter should be an array: "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_2
    invoke-virtual {v1, v14, v9}, Lc7/e1;->h0(Lsd/d;Lqd/a;)Lse/w;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    new-instance v14, Lub/k;

    .line 133
    .line 134
    invoke-direct {v14, v9, v11}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    iget-object v9, v14, Lub/k;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v9, Lse/w;

    .line 140
    .line 141
    iget-object v10, v14, Lub/k;->b:Ljava/lang/Object;

    .line 142
    .line 143
    move-object/from16 v19, v10

    .line 144
    .line 145
    check-cast v19, Lse/w;

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Lbd/p;->getName()Lbe/e;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-virtual {v10}, Lbe/e;->b()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    const-string v14, "equals"

    .line 156
    .line 157
    invoke-static {v10, v14}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_3

    .line 162
    .line 163
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-ne v10, v15, :cond_3

    .line 168
    .line 169
    invoke-interface {v3}, Lyc/y;->g()Lvc/i;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-virtual {v10}, Lvc/i;->o()Lse/a0;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v10, v9}, Lse/w;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_3

    .line 182
    .line 183
    const-string v10, "other"

    .line 184
    .line 185
    invoke-static {v10}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    :goto_3
    move-object v15, v9

    .line 190
    move-object v14, v10

    .line 191
    goto :goto_4

    .line 192
    :cond_3
    iget-object v10, v8, Led/d0;->c:Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v10, :cond_4

    .line 195
    .line 196
    invoke-static {v10}, Lbe/e;->d(Ljava/lang/String;)Lbe/e;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    :cond_4
    if-nez v11, :cond_5

    .line 201
    .line 202
    const/4 v7, 0x1

    .line 203
    :cond_5
    if-nez v11, :cond_6

    .line 204
    .line 205
    new-instance v10, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v11, "p"

    .line 208
    .line 209
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-static {v10}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    goto :goto_3

    .line 224
    :cond_6
    move-object v15, v9

    .line 225
    move-object v14, v11

    .line 226
    :goto_4
    new-instance v9, Lbd/y0;

    .line 227
    .line 228
    iget-object v10, v2, Lod/a;->j:Ldd/e;

    .line 229
    .line 230
    invoke-virtual {v10, v8}, Ldd/e;->c(Lsd/c;)Ldd/g;

    .line 231
    .line 232
    .line 233
    move-result-object v20

    .line 234
    const/4 v11, 0x0

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    move-object/from16 v10, p1

    .line 242
    .line 243
    invoke-direct/range {v9 .. v20}, Lbd/y0;-><init>(Lyc/b;Lbd/y0;ILzc/h;Lbe/e;Lse/w;ZZZLse/w;Lyc/m0;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_7
    invoke-static {v5}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    new-instance v1, Lk5/d;

    .line 256
    .line 257
    const/4 v2, 0x4

    .line 258
    invoke-direct {v1, v0, v7, v2}, Lk5/d;-><init>(Ljava/lang/Object;ZI)V

    .line 259
    .line 260
    .line 261
    return-object v1
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


# virtual methods
.method public b(Lbe/e;Lgd/b;)Ljava/util/Collection;
    .locals 0

    .line 1
    const-string p2, "name"

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lpd/z;->g()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    sget-object p1, Lvb/r;->a:Lvb/r;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object p2, p0, Lpd/z;->l:Lre/e;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lre/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/Collection;

    .line 26
    .line 27
    return-object p1
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

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lpd/z;->m:[Lpc/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lpd/z;->i:Lre/i;

    .line 7
    .line 8
    invoke-static {v1, v0}, Ln7/b0;->r(Lre/m;Lpc/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
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

.method public final d()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lpd/z;->m:[Lpc/u;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lpd/z;->k:Lre/i;

    .line 7
    .line 8
    invoke-static {v1, v0}, Ln7/b0;->r(Lre/m;Lpc/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
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

.method public e(Lle/f;Lic/k;)Ljava/util/Collection;
    .locals 0

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lpd/z;->d:Lre/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lre/i;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/Collection;

    .line 13
    .line 14
    return-object p1
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

.method public f(Lbe/e;Lgd/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lpd/z;->c()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lvb/r;->a:Lvb/r;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    iget-object p2, p0, Lpd/z;->h:Lre/e;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lre/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/Collection;

    .line 31
    .line 32
    return-object p1
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

.method public final g()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lpd/z;->m:[Lpc/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lpd/z;->j:Lre/i;

    .line 7
    .line 8
    invoke-static {v1, v0}, Ln7/b0;->r(Lre/m;Lpc/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
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

.method public abstract h(Lle/f;Lic/k;)Ljava/util/Set;
.end method

.method public abstract i(Lle/f;Lle/l;)Ljava/util/Set;
.end method

.method public j(Lbe/e;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    const-string p2, "name"

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public abstract k()Lpd/c;
.end method

.method public abstract m(Ljava/util/LinkedHashSet;Lbe/e;)V
.end method

.method public abstract n(Lbe/e;Ljava/util/ArrayList;)V
.end method

.method public abstract o(Lle/f;)Ljava/util/Set;
.end method

.method public abstract p()Lbd/a0;
.end method

.method public abstract q()Lyc/k;
.end method

.method public r(Lnd/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
    .line 3
    .line 4
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public abstract s(Led/x;Ljava/util/ArrayList;Lse/w;Ljava/util/List;)Lpd/y;
.end method

.method public final t(Led/x;)Lnd/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "method"

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lpd/z;->b:Lb0/w1;

    .line 11
    .line 12
    invoke-static {v2, v1}, Ln7/e;->z(Lb0/w1;Lsd/b;)Lod/c;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0}, Lpd/z;->q()Lyc/k;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v1}, Led/w;->c()Lbe/e;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    iget-object v6, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Lod/a;

    .line 27
    .line 28
    iget-object v6, v6, Lod/a;->j:Ldd/e;

    .line 29
    .line 30
    invoke-virtual {v6, v1}, Ldd/e;->c(Lsd/c;)Ldd/g;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v0, Lpd/z;->e:Lre/i;

    .line 35
    .line 36
    invoke-virtual {v7}, Lre/i;->b()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Lpd/c;

    .line 41
    .line 42
    invoke-virtual {v1}, Led/w;->c()Lbe/e;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-interface {v7, v8}, Lpd/c;->d(Lbe/e;)Led/a0;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const/4 v8, 0x0

    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, Led/x;->g()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_0

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v7, 0x0

    .line 68
    :goto_0
    invoke-static {v4, v3, v5, v6, v7}, Lnd/e;->S1(Lyc/k;Lod/c;Lbe/e;Ldd/g;Z)Lnd/e;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const-string v3, "<this>"

    .line 73
    .line 74
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v3, v2, Lb0/w1;->b:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v4, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lod/a;

    .line 82
    .line 83
    new-instance v5, Lh7/k;

    .line 84
    .line 85
    invoke-direct {v5, v2, v9, v1, v8}, Lh7/k;-><init>(Lb0/w1;Lyc/l;Lsd/e;I)V

    .line 86
    .line 87
    .line 88
    new-instance v2, Lb0/w1;

    .line 89
    .line 90
    invoke-direct {v2, v4, v5, v3}, Lb0/w1;-><init>(Lod/a;Lod/e;Lub/h;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Led/x;->getTypeParameters()Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    const/16 v5, 0xa

    .line 100
    .line 101
    invoke-static {v3, v5}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_1

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Led/c0;

    .line 123
    .line 124
    iget-object v6, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v6, Lod/e;

    .line 127
    .line 128
    invoke-interface {v6, v5}, Lod/e;->a(Led/c0;)Lyc/q0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    invoke-virtual {v1}, Led/x;->g()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-static {v2, v9, v3}, Lpd/z;->u(Lb0/w1;Lbd/z;Ljava/util/List;)Lk5/d;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v1, v2}, Lpd/z;->l(Led/x;Lb0/w1;)Lse/w;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    iget-object v6, v3, Lk5/d;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, Ljava/util/List;

    .line 154
    .line 155
    invoke-virtual {v0, v1, v4, v5, v6}, Lpd/z;->s(Led/x;Ljava/util/ArrayList;Lse/w;Ljava/util/List;)Lpd/y;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iget-object v5, v4, Lpd/y;->d:Ljava/util/List;

    .line 160
    .line 161
    invoke-virtual {v0}, Lpd/z;->p()Lbd/a0;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    iget-object v13, v4, Lpd/y;->c:Ljava/util/ArrayList;

    .line 166
    .line 167
    iget-object v14, v4, Lpd/y;->b:Ljava/util/List;

    .line 168
    .line 169
    iget-object v15, v4, Lpd/y;->a:Lse/w;

    .line 170
    .line 171
    invoke-virtual {v1}, Led/x;->b()Ljava/lang/reflect/Member;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, Ljava/lang/reflect/Method;

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v1}, Led/x;->b()Ljava/lang/reflect/Member;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Ljava/lang/reflect/Method;

    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    sget-object v7, Lyc/x;->a:Lyc/n0;

    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    if-eqz v4, :cond_2

    .line 205
    .line 206
    sget-object v4, Lyc/x;->e:Lyc/x;

    .line 207
    .line 208
    :goto_2
    move-object/from16 v16, v4

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_2
    if-nez v6, :cond_3

    .line 212
    .line 213
    sget-object v4, Lyc/x;->d:Lyc/x;

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_3
    sget-object v4, Lyc/x;->b:Lyc/x;

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :goto_3
    invoke-virtual {v1}, Led/w;->e()Lyc/e1;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v1}, Lgh/g;->Q(Lyc/e1;)Lld/o;

    .line 224
    .line 225
    .line 226
    move-result-object v17

    .line 227
    sget-object v18, Lvb/s;->a:Lvb/s;

    .line 228
    .line 229
    const/4 v10, 0x0

    .line 230
    sget-object v12, Lvb/r;->a:Lvb/r;

    .line 231
    .line 232
    invoke-virtual/range {v9 .. v18}, Lnd/e;->R1(Lbd/a0;Lbd/a0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lse/w;Lyc/x;Lld/o;Ljava/util/Map;)Lbd/s0;

    .line 233
    .line 234
    .line 235
    iget-boolean v1, v3, Lk5/d;->b:Z

    .line 236
    .line 237
    invoke-virtual {v9, v8, v1}, Lnd/e;->T1(ZZ)V

    .line 238
    .line 239
    .line 240
    check-cast v5, Ljava/util/Collection;

    .line 241
    .line 242
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_4

    .line 247
    .line 248
    return-object v9

    .line 249
    :cond_4
    iget-object v1, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, Lod/a;

    .line 252
    .line 253
    iget-object v1, v1, Lod/a;->e:Lmd/h;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 259
    .line 260
    const-string v2, "Should not be called"

    .line 261
    .line 262
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v1
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy scope for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lpd/z;->q()Lyc/k;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
