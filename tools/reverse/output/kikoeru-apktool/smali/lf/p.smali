.class public final Llf/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/f;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Llf/f;II)V
    .locals 0

    .line 1
    iput p3, p0, Llf/p;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Llf/p;->b:Llf/f;

    .line 4
    .line 5
    iput p2, p0, Llf/p;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final b(Llf/g;Lyb/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Llf/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llf/p;->b:Llf/f;

    .line 7
    .line 8
    check-cast v0, Llf/p;

    .line 9
    .line 10
    new-instance v1, Li7/u0;

    .line 11
    .line 12
    iget v2, p0, Llf/p;->c:I

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, Li7/u0;-><init>(Llf/g;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, p2}, Llf/p;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 27
    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    instance-of v0, p2, Llf/v;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v0, p2

    .line 34
    check-cast v0, Llf/v;

    .line 35
    .line 36
    iget v1, v0, Llf/v;->e:I

    .line 37
    .line 38
    const/high16 v2, -0x80000000

    .line 39
    .line 40
    and-int v3, v1, v2

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    sub-int/2addr v1, v2

    .line 45
    iput v1, v0, Llf/v;->e:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v0, Llf/v;

    .line 49
    .line 50
    invoke-direct {v0, p0, p2}, Llf/v;-><init>(Llf/p;Lyb/c;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget-object p2, v0, Llf/v;->d:Ljava/lang/Object;

    .line 54
    .line 55
    iget v1, v0, Llf/v;->e:I

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    if-ne v1, v2, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, Llf/v;->g:Ljava/lang/Object;

    .line 63
    .line 64
    :try_start_0
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Lmf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception p2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance p2, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v1, Ljc/w;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    :try_start_1
    iget-object v3, p0, Llf/p;->b:Llf/f;

    .line 92
    .line 93
    new-instance v4, Llf/x;

    .line 94
    .line 95
    iget v5, p0, Llf/p;->c:I

    .line 96
    .line 97
    invoke-direct {v4, v1, v5, p1, p2}, Llf/x;-><init>(Ljc/w;ILlf/g;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iput-object p2, v0, Llf/v;->g:Ljava/lang/Object;

    .line 101
    .line 102
    iput v2, v0, Llf/v;->e:I

    .line 103
    .line 104
    invoke-interface {v3, v4, v0}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_1
    .catch Lmf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 109
    .line 110
    if-ne p1, p2, :cond_4

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :catch_1
    move-exception p1

    .line 114
    move-object v6, p2

    .line 115
    move-object p2, p1

    .line 116
    move-object p1, v6

    .line 117
    :goto_2
    iget-object v0, p2, Lmf/a;->a:Ljava/lang/Object;

    .line 118
    .line 119
    if-ne v0, p1, :cond_5

    .line 120
    .line 121
    :cond_4
    :goto_3
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 122
    .line 123
    :goto_4
    return-object p2

    .line 124
    :cond_5
    throw p2

    .line 125
    :pswitch_1
    new-instance v0, Ljc/w;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v1, Llf/r;

    .line 131
    .line 132
    iget v2, p0, Llf/p;->c:I

    .line 133
    .line 134
    invoke-direct {v1, v0, v2, p1}, Llf/r;-><init>(Ljc/w;ILlf/g;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Llf/p;->b:Llf/f;

    .line 138
    .line 139
    invoke-interface {p1, v1, p2}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 144
    .line 145
    if-ne p1, p2, :cond_6

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 149
    .line 150
    :goto_5
    return-object p1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
