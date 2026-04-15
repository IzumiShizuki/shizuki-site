.class public final Li7/u1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/g;

.field public final synthetic c:Lac/i;


# direct methods
.method public constructor <init>(Llf/g;Lic/n;I)V
    .locals 0

    .line 1
    iput p3, p0, Li7/u1;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li7/u1;->b:Llf/g;

    .line 10
    .line 11
    check-cast p2, Lac/i;

    .line 12
    .line 13
    iput-object p2, p0, Li7/u1;->c:Lac/i;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Li7/u1;->b:Llf/g;

    .line 20
    .line 21
    check-cast p2, Lac/i;

    .line 22
    .line 23
    iput-object p2, p0, Li7/u1;->c:Lac/i;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
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
.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Li7/u1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Li7/w1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Li7/w1;

    .line 12
    .line 13
    iget v1, v0, Li7/w1;->e:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Li7/w1;->e:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Li7/w1;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Li7/w1;-><init>(Li7/u1;Lyb/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Li7/w1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Li7/w1;->e:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, Li7/w1;->f:Llf/g;

    .line 57
    .line 58
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Li7/k0;

    .line 66
    .line 67
    iget-object p2, p0, Li7/u1;->b:Llf/g;

    .line 68
    .line 69
    iput-object p2, v0, Li7/w1;->f:Llf/g;

    .line 70
    .line 71
    iput v3, v0, Li7/w1;->e:I

    .line 72
    .line 73
    iget-object v1, p0, Li7/u1;->c:Lac/i;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Li7/k0;->b(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v4, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-object v5, p2

    .line 83
    move-object p2, p1

    .line 84
    move-object p1, v5

    .line 85
    :goto_1
    const/4 v1, 0x0

    .line 86
    iput-object v1, v0, Li7/w1;->f:Llf/g;

    .line 87
    .line 88
    iput v2, v0, Li7/w1;->e:I

    .line 89
    .line 90
    invoke-interface {p1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v4, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    :goto_2
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 98
    .line 99
    :goto_3
    return-object v4

    .line 100
    :pswitch_0
    instance-of v0, p2, Li7/t1;

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    move-object v0, p2

    .line 105
    check-cast v0, Li7/t1;

    .line 106
    .line 107
    iget v1, v0, Li7/t1;->e:I

    .line 108
    .line 109
    const/high16 v2, -0x80000000

    .line 110
    .line 111
    and-int v3, v1, v2

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    sub-int/2addr v1, v2

    .line 116
    iput v1, v0, Li7/t1;->e:I

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_6
    new-instance v0, Li7/t1;

    .line 120
    .line 121
    invoke-direct {v0, p0, p2}, Li7/t1;-><init>(Li7/u1;Lyb/c;)V

    .line 122
    .line 123
    .line 124
    :goto_4
    iget-object p2, v0, Li7/t1;->d:Ljava/lang/Object;

    .line 125
    .line 126
    iget v1, v0, Li7/t1;->e:I

    .line 127
    .line 128
    const/4 v2, 0x2

    .line 129
    const/4 v3, 0x1

    .line 130
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 131
    .line 132
    if-eqz v1, :cond_9

    .line 133
    .line 134
    if-eq v1, v3, :cond_8

    .line 135
    .line 136
    if-ne v1, v2, :cond_7

    .line 137
    .line 138
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_8
    iget-object p1, v0, Li7/t1;->f:Llf/g;

    .line 151
    .line 152
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_9
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    check-cast p1, Li7/k0;

    .line 160
    .line 161
    iget-object p2, p0, Li7/u1;->b:Llf/g;

    .line 162
    .line 163
    iput-object p2, v0, Li7/t1;->f:Llf/g;

    .line 164
    .line 165
    iput v3, v0, Li7/t1;->e:I

    .line 166
    .line 167
    iget-object v1, p0, Li7/u1;->c:Lac/i;

    .line 168
    .line 169
    invoke-virtual {p1, v1, v0}, Li7/k0;->a(Lic/n;Lac/c;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, v4, :cond_a

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_a
    move-object v5, p2

    .line 177
    move-object p2, p1

    .line 178
    move-object p1, v5

    .line 179
    :goto_5
    const/4 v1, 0x0

    .line 180
    iput-object v1, v0, Li7/t1;->f:Llf/g;

    .line 181
    .line 182
    iput v2, v0, Li7/t1;->e:I

    .line 183
    .line 184
    invoke-interface {p1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v4, :cond_b

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_b
    :goto_6
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 192
    .line 193
    :goto_7
    return-object v4

    .line 194
    nop

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
.end method
